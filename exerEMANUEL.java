import java.util.Scanner;
import javax.swing.*;

public class exerEMANUEL{
    public static void main(String[] args) {
        String nome1 = "0 a 2 é bebê";
        String nome2 = "3 a 11 é criança";
        String nome3 = "12 a 19 é adolescente";
        String nome4 = "20 a 30 é jovem";
        String nome5 = "31 a 60 é adulto";
        String nome6 = "+60 é Idoso";
       Scanner  input = new Scanner(System.in);
    Integer idade;
    
    System.out.println("Digite sua idade: ");
    idade = input.nextInt();
    
    if (idade >= 0  && idade <= 2) {
        JOptionPane.showMessageDialog(null,nome1);
    }
    
    if (idade >= 3 && idade <= 11) {
        JOptionPane.showConfirmDialog(null,nome2); }
   if (idade >= 12 && idade <= 19) {
        JOptionPane.showMessageDialog(null,nome3); }
   if (idade >= 20 && idade <= 30) {
    JOptionPane.showConfirmDialog(null,nome4); }
   if (idade >= 31 && idade <= 60) {
    JOptionPane.showConfirmDialog(null,nome5); }
   if (idade >= 61) {
    JOptionPane.showConfirmDialog(null,nome6); }

}
}