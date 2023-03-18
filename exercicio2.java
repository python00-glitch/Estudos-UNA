import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args){
        double n1, n2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero e descubra se ele é PAR ou IMPAR: ");
        n1 = teclado.nextDouble();

        if (n1%2 == 0){
            System.out.println("Seu numero é PAR.");
        }else{
            System.out.println("Seu numero é IMPAR");
        }
    }
    
}
