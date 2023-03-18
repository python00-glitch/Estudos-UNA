import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, total;

        System.out.println("Descubra se, com suas notas, ficou de RECUPERAÇAO, nos EXAMES, ou foi APROVADO!");
        System.out.println("Prova de Portugues: ");
        nota1 = teclado.nextFloat();
        System.out.println("Prova de Matematica: ");
        nota2 = teclado.nextFloat();
        System.out.println("Prova de Geografia: ");
        nota3 = teclado.nextFloat();

        if (nota1 + nota2 + nota3 < 10){
            System.out.println("Você está REPROVADO.");
        }if(nota1 + nota2 + nota3 > 10){

        }
    }
    
}
