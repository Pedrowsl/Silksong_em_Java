public class InimigoTeste {
    public static void main(String[] args){
        Inimigo inimigo1 = new Inimigo("Moss Mother", 12, 1);
        Inimigo inimigo2 = new Inimigo("Besouro Peregrino");
        Inimigo inimigo3 = new Inimigo("Inimigo Bugado", 50, 7);

        System.out.println(inimigo1);
        System.out.println(inimigo2);
        System.out.println(inimigo3);

        while(!inimigo2.estaDerrotado()){
            inimigo2.receberGolpe();
        }
        System.out.println(inimigo2);
        System.out.println("Derrotado? " + inimigo2.estaDerrotado());
    }
}
