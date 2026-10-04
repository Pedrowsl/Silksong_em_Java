import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) throws InterruptedException{
        Heroina hornet = new Heroina("Hornet");
        Inimigo inimigo1 = new Inimigo("Moss Mother", 12, 1);
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("    HOLLOW KNIGHT: SILKSONG");
        System.out.println("       edicao POO em Java");
        System.out.println("=================================");
        String nome = JOptionPane.showInputDialog("Insira seu nome: ");
        System.out.println("Carregando save de " + nome + "...");
        System.out.println(hornet);

        int turno = 1;
        int opcao;
        do {
            System.out.println("========== Turno " + turno +" ==========");
            System.out.println(hornet);
            System.out.println(inimigo1);

            System.out.println("1-Atacar 2-Curar 0-Fugir");
            System.out.printf("Escolha: ");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    hornet.atacar();
                    inimigo1.receberGolpe();
                    break;
                case 2:
                    hornet.curar();
                    break;
                case 0:
                    System.out.println(hornet.getNome() + " fugiu da batalha.");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            if(turno % 3 == 0 && !inimigo1.estaDerrotado() && opcao!=0){
                System.out.println(inimigo1.getNome() + " ataca!");
                hornet.receberDano(inimigo1.getDano());
            }
            turno++;
            Thread.sleep(1000);
        } while (!inimigo1.estaDerrotado() && !hornet.estaDerrotada() && opcao!=0);

        if(hornet.estaDerrotada()){
            System.out.println("Fim de jogo.");
        }
        else if(inimigo1.estaDerrotado()){
            System.out.println("Vitoria sobre " + inimigo1.getNome() + "!");
        }
        System.out.println(hornet);

        scanner.close();
    }
}