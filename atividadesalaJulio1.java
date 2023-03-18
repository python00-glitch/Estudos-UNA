import java.util.Scanner;
public class atividadesalaJulio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float b1, b2, b3, b4, somaB, somaS, saldo;

        System.out.println("Digite seu saldo atual");
        saldo = teclado.nextFloat();
        
        System.out.println("Digite o valor do boleto: ");
        b1 = teclado.nextFloat();
        System.out.println("Digite o valor do boleto: ");
        b2 = teclado.nextFloat();
        System.out.println("Digite o valor do boleto: ");
        b3 = teclado.nextFloat();
        System.out.println("Digite o valor do boleto: ");
        b4 = teclado.nextFloat();

        somaB = b1 + b2 + b3 + b4;
        somaS = saldo - somaB;

        System.out.println("O total dos boletos deu " + (somaB));
        System.out.println("E seu saldo terminou em "+ (somaS));
    }
    
}
