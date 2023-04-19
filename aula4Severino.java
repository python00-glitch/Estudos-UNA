import java.util.Scanner;
public class aula4Severino {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double n1,n2;
        System.out.println("Digite um numero e descubra a 25% dele: ");
        n1 = teclado.nextFloat();

        n2 = n1 * 0.25;
        System.out.println("Sua porcentagem é de: "+n2);
    }
}
