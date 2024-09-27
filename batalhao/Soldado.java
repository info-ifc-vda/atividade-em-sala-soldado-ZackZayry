package batalhao;

public class Soldado 
{
    private String nome;
    private int posicao;
    private String ataque;
    private int quantidade =0;
    private boolean qnt = false;
    private static int numero = 10;
    //pensar sobre o controle no número de instâncias

    public Soldado(String nome)
    {
        this.nome = "";
        this.posicao = 0;
        this.quantidade ++;
        if(quantidade > numero)
        {
            this.qnt = true;
        }
    }


    public void movi ()
    {
        this.posicao += 10;
    }
    public void movi(int dist)
    {
        this.posicao += dist;
    }


    public void ataca ()
    {
       if(qnt == true)
       {
            this.ataque = "fuzil";
       }
      
    }
    public void ataca(String arma)
    {
        if(qnt == true)
        {
            this.ataque = arma;
        }
    }


    public void setNome (String nome1)
    {
        this.nome = nome1;
    }
    public String getNome()
    {
        return nome;
    }

    public int getPosicao()
    {
        return posicao;
    }
    public String getAtaque()
    {
        return ataque;
    }
    public int getQuantidade()
    {
        return quantidade;
    }
}
