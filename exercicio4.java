import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        n1 = teclado.nextInt();

        if (n1 >= 0){
            n2 = n1 * 3;
            System.out.println(n2);
        }
        if(n1 < 0){
            n2 = n1 * 2;
            System.out.println(n2);
        }
    }
    
}
