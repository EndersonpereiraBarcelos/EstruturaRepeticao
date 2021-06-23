import java.util.Scanner;

public class exercicio11 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.print("Informe o segundo numero: ");
        double n2 = sc.nextDouble();

        double soma = 0;


       for(double i=n1; i<=n2; i++){
            soma +=i;
        }

        System.out.print("Soma: " + soma);
    }
    
}

    

