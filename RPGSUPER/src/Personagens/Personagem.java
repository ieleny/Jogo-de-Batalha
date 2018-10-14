/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagens;

/**
 *
 * @author Ieleny
 */
public class Personagem extends TodosPersonagens{
    
    public void ListaPersonagens(){
        for(int i = 0; i < TipoPersonagem.length; i++){
            System.out.println("\nNumero do Personagem: "+i+"º");
            System.out.println("Classe: "+TipoPersonagem[i]);
            System.out.println("Velocidade:"+TipoVelocidade[i]);
            System.out.println("Força:"+TipoForca[i]);
            System.out.println("Arma:"+TipoArma[i]);
            System.out.println("Quantidade de Munição:"+TipoQuantidadeMunicao[i]);
        } 
    }
    
    public void NumeroPersonagem(int Numero){
        SetClassePersonagem(TipoPersonagem[Numero]);
        SetVelocidade(TipoVelocidade[Numero]);
        SetForca(TipoForca[Numero]);
        SetArma(TipoArma[Numero]);
        SetQuantidadeMunicao(TipoQuantidadeMunicao[Numero]);
    }
    
}
