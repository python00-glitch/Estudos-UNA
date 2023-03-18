import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args){
        float peso, altura, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Descubra seu IMC agora!!");
        System.out.println("Digite seu peso: ");
        peso = teclado.nextFloat();
        altura = teclado.nextFloat();

        imc = peso/(altura);
    }
    
}
