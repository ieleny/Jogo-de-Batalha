/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagens;
import java.util.Scanner;

/**
 *
 * @author Ieleny
 */
public class Batalha {
    
    private String NomePersonagem;
    private String ClassePersonagem;
    private int Velocidade;
    private int Forca;
    private String Arma;
    private int QuantidadeMunicao;
    
    private String ClasseOponente;
    private int VelocidadeOponente;
    private int ForcaOponente;
    private String ArmaOponente;
    private int QuantidadeMunicaoOponente;
    
    private int danoPersonagem = 10000;
    private int danoOponente = 10000;
    
    Scanner Scanner = new Scanner(System.in);
   
    public void ValorPersonagem(String NomePersonagem,String ClassePersonagem,int Velocidade,int Forca,String Arma,int QuantidadeMunicao){
        this.NomePersonagem = NomePersonagem;
        this.ClassePersonagem = ClassePersonagem;
        this.Velocidade = Velocidade;
        this.Forca = Forca;
        this.Arma = Arma;
        this.QuantidadeMunicao = QuantidadeMunicao;
    }
    
    public void ValorOponente(String ClasseOponente,int VelocidadeOponente,int ForcaOponente,String ArmaOponente,int QuantidadeMunicaoOponente){
        this.ClasseOponente = ClasseOponente;
        this.VelocidadeOponente = VelocidadeOponente;
        this.ForcaOponente = ForcaOponente;
        this.ArmaOponente = ArmaOponente;
        this.QuantidadeMunicaoOponente = QuantidadeMunicaoOponente;
    }
    
    public void rodada(){
        
        System.out.println("\n \n Jogador "+this.NomePersonagem+" Digite um numero entre 0 a 4. Para receber Mais Força:");
        
        //Definindo Forca Extra
        int numeropersonagem = Scanner.nextInt();
        this.Forca         =  this.Forca + this.printCartas(numeropersonagem);
        System.out.println("Sua Força foi Atualizada para "+this.Forca);
        this.ForcaOponente =  this.ForcaOponente + this.printCartas((int)(Math.random() * 3));
        System.out.println("Sua Força do Oponente foi atualizada para "+this.ForcaOponente);
        
        int incremento = 1;
        while(incremento != 0){
            System.out.println("Jogador "+this.NomePersonagem+" \n Escolha o ataque 0 - Bater , 1 - Utilizar Arma ");
            int arma = Scanner.nextInt();
            incremento = this.batalha(arma,(int)(Math.random() * 1));
        }
       
    }
    
    private int batalha(int jogador,int Oponente){
        
        int incremento;
        int forcaPersonagem;
        int forcaOponente;
        
        if(jogador == 0 && Oponente == 0){
            
            forcaPersonagem = this.calcularBaterKatanas(this.Forca,this.Velocidade);
            forcaOponente   = this.calcularBaterKatanas(this.ForcaOponente,this.VelocidadeOponente);
            
            this.danoPersonagem = this.danoPersonagem - forcaOponente;
            this.danoOponente   = this.danoOponente   - forcaPersonagem;
            
            System.out.println("Jogador  Dano:"+this.danoPersonagem);
            System.out.println("Oponente Dano:"+this.danoOponente);
            
        }else if (jogador == 0 && Oponente == 1){
            
            forcaPersonagem     = this.calcularBaterKatanas(this.Forca,this.Velocidade);
            forcaOponente       = this.armaOponente(this.ArmaOponente,this.ForcaOponente,this.VelocidadeOponente,this.QuantidadeMunicaoOponente);
            this.danoPersonagem = this.danoPersonagem - forcaOponente;
            this.danoOponente   = this.danoOponente   - forcaPersonagem;
            
            System.out.println("Jogador  Dano:"+this.danoPersonagem);
            System.out.println("Oponente Dano:"+this.danoOponente);
            
            
        }else if(jogador == 1 && Oponente == 0){
            
            forcaPersonagem     = this.armaPersonagem(this.Arma,this.Forca,this.Velocidade,this.QuantidadeMunicao);
            forcaOponente       = this.calcularBaterKatanas(this.ForcaOponente,this.VelocidadeOponente);
            this.danoPersonagem = this.danoPersonagem - forcaOponente;
            this.danoOponente   = this.danoOponente   - forcaPersonagem;
            
            System.out.println("Jogador  Dano:"+this.danoPersonagem);
            System.out.println("Oponente Dano:"+this.danoOponente);
            
        }else if(jogador == 1 && Oponente == 1){
            
            forcaPersonagem     = this.armaPersonagem(this.Arma,this.Forca,this.Velocidade,this.QuantidadeMunicao);
            forcaOponente       = this.armaOponente(this.ArmaOponente,this.ForcaOponente,this.VelocidadeOponente,this.QuantidadeMunicaoOponente);
            this.danoPersonagem = this.danoPersonagem - forcaOponente;
            this.danoOponente   = this.danoOponente   - forcaPersonagem;
            
            System.out.println("Jogador  Dano:"+this.danoPersonagem);
            System.out.println("Oponente Dano:"+this.danoOponente);
            
        }
        
        if(this.danoPersonagem <= 0){
            System.out.println("VOCE PERDEU !!!!!");
            incremento = 0;
        }else if (this.danoOponente <= 0){
            System.out.println("VOCE GANHOU !!!!!");
            incremento = 0;
        }else{
            incremento = 1;
        }
        
        return incremento;
    }
    
    public int printCartas(int numerocartas){
        
        int number;

        switch (numerocartas) {
            case 0:
                number = 110;
                break;
            case 1:
                number = 234;
                break;
            case 2:
                number = 123;
                break;
            case 3:
                number = 5;
                break;
            case 4:
                number = 23;
                break;
            default: 
                number = 0;
                break;
        }

        return number;

    }
    
    
    public int armaOponente(String Arma, int forca , int velocidade, int municao){
        
        int valorArma;
       
        switch (Arma) {
            case "Arco":
                System.out.println("VOCE TEM  "+municao+" QUAL A QUANTIDADE DE MUNICAO QUE DESEJA USAR NESSA RODADA?");
                int quantidadeMunicao = Scanner.nextInt();
                valorArma = this.calcularArco(forca, velocidade) * quantidadeMunicao;
                this.QuantidadeMunicaoOponente = this.QuantidadeMunicaoOponente - quantidadeMunicao;
                break;
            case "Espada":
                valorArma = this.calcularEspada(forca, velocidade);
                break;
            case "Sniper":
                System.out.println("VOCE TEM "+municao+" QUAL A QUANTIDADE DE MUNICAO QUE DESEJA USAR NESSA RODADA?");
                int quantidadeMunicaoSniper = Scanner.nextInt();
                valorArma = this.calcularAtirar(velocidade) * quantidadeMunicaoSniper;
                this.QuantidadeMunicaoOponente = this.QuantidadeMunicaoOponente - quantidadeMunicaoSniper;
                break;
            case "Katanas":
                System.out.println("VOCE TEM "+municao+" QUAL A QUANTIDADE DE MUNICAO QUE DESEJA USAR NESSA RODADA?");
                int quantidadeMunicaoKatanas = Scanner.nextInt();
                valorArma = this.calcularBaterKatanas(forca, velocidade) * quantidadeMunicaoKatanas;
                this.QuantidadeMunicaoOponente = this.QuantidadeMunicaoOponente - quantidadeMunicaoKatanas;
                break;
            default: 
                valorArma = 0;
                break;
        }

        return valorArma;
        
    }
    
    public int armaPersonagem(String Arma, int forca , int velocidade, int municao){
        
        int valorArma;
       
        switch (Arma) {
            case "Arco":
                System.out.println("VOCE TEM "+municao+" QUAL A QUANTIDADE DE MUNICAO QUE DESEJA USAR NESSA RODADA?");
                int quantidadeMunicao = Scanner.nextInt();
                valorArma = this.calcularArco(forca, velocidade) * quantidadeMunicao;
                this.QuantidadeMunicao = this.QuantidadeMunicao - quantidadeMunicao;
                break;
            case "Espada":
                valorArma = this.calcularEspada(forca, velocidade);
                break;
            case "Sniper":
                System.out.println("VOCE TEM "+municao+" QUAL A QUANTIDADE DE MUNICAO QUE DESEJA USAR NESSA RODADA?");
                int quantidadeMunicaoSniper = Scanner.nextInt();
                valorArma = this.calcularAtirar(velocidade) * quantidadeMunicaoSniper;
                this.QuantidadeMunicao = this.QuantidadeMunicao - quantidadeMunicaoSniper;
                break;
            case "Katanas":
                System.out.println("VOCE TEM "+municao+" QUAL A QUANTIDADE DE MUNICAO QUE DESEJA USAR NESSA RODADA?");
                int quantidadeMunicaoKatanas = Scanner.nextInt();
                valorArma = this.calcularBaterKatanas(forca, velocidade) * quantidadeMunicaoKatanas;
                this.QuantidadeMunicao = this.QuantidadeMunicao - quantidadeMunicaoKatanas;
                break;
            default: 
                valorArma = 0;
                break;
        }

        return valorArma;
       
        
    }
    
    //CALCULOS
    private int calcularBaterKatanas(int forca, int velocidade){
        return forca * velocidade;
    }
    
    private int calcularAtirar(int velocidade){
        return 30 * velocidade;
    }
    
    private int calcularEspada(int forca,int velocidade){
        return velocidade/forca;
    }
    
    private int calcularArco(int forca,int velocidade){
        return 20 * velocidade;
    }
    
    
    //Calculo Porcentagem
//    private int calcularDano(int forca, int porcentagemDano){
//        return forca * porcentagemDano/100;
//    }
    
    
    
    
    
    
}
