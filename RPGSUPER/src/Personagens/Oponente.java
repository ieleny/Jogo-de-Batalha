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
public final class Oponente extends TodosPersonagens{
    
    private int v[];  
    
    public Oponente(){
        this.SorteioOponente();
    }

    public void SorteioOponente(){
        
        v = new int[1]; //inicializa o array com 10 posições
        for(int i=0;i<v.length;i++)
        {  
           v[i] = (int)(Math.random() * 4); // atribui o valor aleatório à posição i  
        }
        
        SetClassePersonagem(TipoPersonagem[v[0]]);
        SetVelocidade(TipoVelocidade[v[0]]);
        SetForca(TipoForca[v[0]]);
        SetArma(TipoArma[v[0]]);
        SetQuantidadeMunicao(TipoQuantidadeMunicao[v[0]]);
    }
   
}
