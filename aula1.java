/*
Aula 1 de programaçao em Java na UNA Betim com professor Severino, dia 06/03/23
O código de saida para dar 'print' no Java é o "System.out.println"
O "println" se escreve "PRINTLN", mas em minuscula
Para ler o teclado do usuario, deve-se importar o "Scanner"
Para usar-lo, clamar um novo objeto para ser usado no código, definir seu nome (variavel), e definir o Scanner como novo objeto e digitar (System.in)
Na criaçao do novo objeto importado, o "(System.in)" significa: System = o sistema do usuario / in = input
*/
import java.util.Scanner;
public class aula1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String nome;
        
        System.out.println("Digite seu nome: "); nome=teclado.next();

        System.out.println("Boa noite, "+nome);
    }
}