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
public class TodosPersonagens {
    
    //Informacoes dos personagens
    public String[] TipoPersonagem = {"Arqueiro","Duelista","Sniper","Ninja"};
    public int[] TipoVelocidade = {7,10,5,10};
    public int[] TipoForca = {4,7,4,6};
    public String[] TipoArma = {"Arco","Espada","Sniper","Katanas"};
    public int[] TipoQuantidadeMunicao = {20,2,70,20};
    public String[] DesenhoPersonagem  = {"\nyyyyyyyyy\n|	  |   \\\n(         )    \\\n|	  | ^^  \\\n/ -------  \\---  \\\n/	   \\  |	  \\\n---------------\n",
        "\nyyyyyyyyy\n|	  |     /)\n(         )   //\n|	  |   //\n/-------\\  //\n/	   \\// \n --------------- \n",
        "\nyyyyyyyyy \n|	  |     /)\n(         )   //\n|	  |   //\n/-------\\\\  //\n/	   \\\\// \n |---------------| \n",
        "\nyyyyyyyyy\n|	  |     /)\n(         )   //\n|	  |   //\n/---|----\\\\  //\n/	   \\\\// \n --------------- \n"};
    
    //Variaveis Comuns
    protected int Forca;
    protected int Velocidade;
    protected String Arma;
    protected String NomePersonagem;
    protected String ClassePersonagem;
    protected int QuantidadeMunicao;
    
    //Getters e Setters
    public void SetForca(int Forca) {
        this.Forca = Forca;
    }
    
    public int getForca() {
        return Forca;
    }
    
    public void SetQuantidadeMunicao(int QuantidadeMunicao) {
        this.QuantidadeMunicao = QuantidadeMunicao;
    }
    
    public int getQuantidadeMunicao() {
        return QuantidadeMunicao;
    }
    
    public void SetVelocidade(int Velocidade) {
        this.Velocidade = Velocidade;
    }
    
    public int getVelocidade() {
        return Velocidade;
    }
 
    public void SetArma(String Arma) {
        this.Arma = Arma;
    }
    
    public String getArma() {
        return Arma;
    }
    
    public void SetNomePersonagem(String NomePersonagem) {
        this.NomePersonagem = NomePersonagem;
    }
    
    public String getNomePersonagem() {
        return NomePersonagem;
    }
    
    public void SetClassePersonagem(String ClassePersonagem) {
        this.ClassePersonagem = ClassePersonagem;
    }
    
    public String getClassePersonagem() {
        return ClassePersonagem;
    } 
    
    
}
