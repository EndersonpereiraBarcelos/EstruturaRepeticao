import java.util.Scanner;

public class exercicio10 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Informe o segundo numero: ");
        double n2 = sc.nextDouble();


       for(double i=n1; i<=n2; i++){
            System.out.println(i);
        }
    }
    
}
