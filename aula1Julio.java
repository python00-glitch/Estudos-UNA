import java.util.Scanner;
public class aula1Julio {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double salario,nSalario;
        System.out.println("Digite o seu salário atual: ");
        salario = teclado.nextInt();

        nSalario = salario * 1.25;
        System.out.println("Seu salário foi aumentado para "+nSalario);
    }
}
