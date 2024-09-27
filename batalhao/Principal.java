package batalhao;

public class Principal 
{
    public static void main(String[] args)
    {
        String nome  =  "Zack";
        int dist = 5;
        String arma = "Baioneta";

        Soldado s1 = new Soldado(nome);
        s1.movi(dist);
        s1.ataca(arma);

    }
}
