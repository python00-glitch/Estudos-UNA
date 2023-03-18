//Digitar "sout" e clicar em 'TAB' formula a vafriavel de saída de texto//
//Há duas formas de inserir numeros programando: declarando que tipo de variavel sera usada antes (como feito nesse código), ou integrando direto com o scanner//
//No Java, nao é possivel colocar variavel de numero junto com texto, como feito no python ou c#//

import java.util.Scanner;
public class aula2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n1,n2,soma;
        char t;

        //ENTRADA//
        System.out.println("Digite o primeiro numeros: ");
        n1 = teclado.nextInt();
        System.out.println("Digite o tipo: ");
        t = teclado.nextChar();
        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextInt();
        //PROCESAMENTO//
        if (t == +){
            n1+n2;
        }
        //SAÍDA//
        System.out.println(soma);
    }
    
}
