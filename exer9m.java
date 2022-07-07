
import java.util.Scanner;

public class exer9m {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        Double libra = 454.0;
        Double quilo 1000.0;
        Double quiloR;
        Double libraR;
        Integer gramas;

        System.out.println("Digite a quantidade de Gramas: ");
        gramas = input.nextInt();
        quiloR = gramas / quilo;
        libraR = gramas / libra;

        System.out.println("Quantidade de gramas em libra: " + libraR);
        System.out.println("Quantidade de gramas em quilos: " + quiloR);
        

}
}