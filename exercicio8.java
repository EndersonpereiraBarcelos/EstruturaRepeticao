import java.util.Scanner;

public class exercicio8 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Informe segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.print("Informe terceiro numeoro: ");
        double num3 = sc.nextDouble();

        System.out.print("Informe quarto numero: ");
        double num4 = sc.nextDouble();

        System.out.print("Informe o quinto numero: ");
        double num5 = sc.nextDouble();

        double soma = (num1 + num2 + num3 + num4 + num5) / 2;

        System.out.print("A soma dos Numeros são " + soma);
    }
}