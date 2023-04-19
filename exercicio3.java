import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;

        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        if (n1 == n2) {
            n3 = n1 + n2;
            System.out.println(n3);
        } else {
            n3 = n3 * n2;
            System.out.println(n3);
        }
    }
}
