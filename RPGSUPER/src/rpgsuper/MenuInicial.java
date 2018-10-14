/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpgsuper;

import Personagens.Oponente;
import Personagens.Personagem;
import Personagens.Batalha;
import java.util.Scanner;

/**
 *
 * @author Ieleny
 */
public class MenuInicial {
    
    Personagem personagem = new Personagem();
    Oponente oponente = new Oponente();
    
    public MenuInicial(){
        this.Chamada();
        this.Perguntas();
        this.Oponente();
        this.Batalha();
    }
    
    private void Chamada(){
        System.out.println("***************************************************");
        System.out.println("************* BATALHA ENTRE OS GIGANTES ***********");
        System.out.println("***************************************************");
    }
    
    private void Perguntas(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Seja Bem Vindo ao nosso game RPG SUPER CRAZY FUN");
        personagem.ListaPersonagens();
        System.out.println("\n Digite o numero do personagem a sua escolha:\n");
        int numeropersonagem = Scanner.nextInt();
        personagem.NumeroPersonagem(numeropersonagem);
        System.out.println("\n Agora, Digite o nome do seu personagem\n");
        String NomePersonagem = Scanner.next();
        personagem.SetNomePersonagem(NomePersonagem);
        this.ResultPersonagem();
    }
    
    private void ResultPersonagem(){
        System.out.println("\n Parabens!!! Você escolheu o seu personagem");
        System.out.println("O nome do seu Personagem é:"+personagem.getNomePersonagem());
        System.out.println("Classe: "+personagem.getClassePersonagem());
        System.out.println("Velocidade:"+personagem.getVelocidade());
        System.out.println("Força:"+personagem.getForca());
        System.out.println("Arma:"+personagem.getArma());
        System.out.println("Quantidade de Munição:"+personagem.getQuantidadeMunicao());
    }
    
    private void Oponente(){
        System.out.println("\n Detalhes do Oponente:");
        System.out.println("Classe: "+oponente.getClassePersonagem());
        System.out.println("Velocidade:"+oponente.getVelocidade());
        System.out.println("Força:"+oponente.getForca());
        System.out.println("Arma:"+oponente.getArma());
        System.out.println("Quantidade de Munição:"+oponente.getQuantidadeMunicao());
    }
    
    private void Batalha(){
       Batalha batalha = new Batalha();
       batalha.ValorPersonagem(personagem.getNomePersonagem(),personagem.getClassePersonagem(),personagem.getVelocidade(),personagem.getForca(),personagem.getArma(),personagem.getQuantidadeMunicao());
       batalha.ValorOponente(oponente.getClassePersonagem(),oponente.getVelocidade(),oponente.getForca(), oponente.getArma(),oponente.getQuantidadeMunicao());
       batalha.rodada();
    }
   
}
