import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Insira um numero: ");
        n1 = teclado.nextInt();
        System.out.println("Digite mais um numero: ");
        n2 = teclado.nextInt();
        System.out.println("Novamente, mais um: ");
        n3 = teclado.nextInt();

        if (n1+n2 < n3){
            System.out.println("A soma dos primeiros dois algarismos é MENOR que o terceiro numero.");
        }else{
            System.out.println("A soma dos primeiros dois algarismos é MAIOR que o terceiro numero.");
        }
    }
    
}
