import java.util.Scanner;

public class exercicio7{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        float maior, num;

        int count =2;

        System.out.println("Numro 1: ");
        num = sc.nextInt();
        maior = num;

        while (count <= 5){
            System.out.print("Numero " + count + ": ");
            num = sc.nextFloat();

            if (num > maior){
                maior = num;
            }
            count++;
        }
        System.out.print("O maior numero digitado é: " + maior);
    }
}