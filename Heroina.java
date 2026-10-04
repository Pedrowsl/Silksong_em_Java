public class Heroina{
    public static final int MASCARAS_MINIMO = 0;
    public static final int MASCARAS_MAXIMO = 5;
    public static final int SEDA_MINIMO = 0;
    public static final int SEDA_MAXIMO = 9;
    private String nome;
    private int mascaras=MASCARAS_MAXIMO;
    private int seda=SEDA_MINIMO;

    public Heroina(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public int getMascaras(){
        return mascaras;
    }
    public int getSeda(){
        return seda;
    }
    public String toString(){
        return nome + " | Mascaras: " + mascaras+"/5 | Seda: " + seda+"/9";
    }
}