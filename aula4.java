import java.util.Scanner;

public class aula4 {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        float n1;
        System.out.println("Digite um numero e saiba se ele é PAR ou ÍMPAR: ");
        n1 = teclado.nextFloat();
        if (n1 == 0) {
            System.out.println("Seu numero é NEUTRO.");
        } else if (n1 % 2 == 0) {
            System.out.println("Seu numero é PAR.");
        } else {
            System.out.println("Seu numero é IMPAR.");
        }
    }
}
