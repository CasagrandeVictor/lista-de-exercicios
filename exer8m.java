import java.util.Scanner;

import javax.swing.JOptionPane;

public class exer8m {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
    double total,valorhora,hora;
    String aviso = "Atenção, dirija-se à direção do Hotel!";

    valorhora = 10.25;
    System.out.println("Digite as horas trabalhadas: ");
    hora = input.nextDouble();
    total = hora * valorhora;
    System.out.println("Seu Salário de acordo com as horas :R$"+total);

    if (total < 50.00) {

        JOptionPane.showMessageDialog(null,aviso);  }

}

}