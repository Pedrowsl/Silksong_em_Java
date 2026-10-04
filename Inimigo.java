import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Inimigo {
    public static final int VIDA_MINIMO=0;
    public static final int VIDA_PADRAO=10;
    public static final int VIDA_MAXIMO=20;
    public static final int DANO_MINIMO=1;
    public static final int DANO_MAXIMO=2;
    private String nome;
    private int vida;
    private int dano;

    public Inimigo(String nome, int vida, int dano){
        this.nome = nome;
        this.vida = (vida>VIDA_MINIMO && vida<=VIDA_MAXIMO) ? vida : VIDA_PADRAO;
        this.dano = (dano==DANO_MINIMO || dano==DANO_MAXIMO) ? dano : DANO_MINIMO;
    }
    public Inimigo(String nome){
        this(nome, VIDA_PADRAO, DANO_MINIMO);
    }
    public void receberGolpe(){
        if(vida>VIDA_MINIMO){
            vida--;
            System.out.println(nome + " recebeu 1 de dano.");
        }
    }
    public boolean estaDerrotado(){
        return vida == VIDA_MINIMO;
    }
}