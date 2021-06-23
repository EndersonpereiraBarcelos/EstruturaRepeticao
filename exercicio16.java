//import java.util.Scanner;

public class exercicio16 {

    public static  void main(String[]args){

       // Scanner sc = new Scanner(System.in);

       // System.out.print("Entre com n-éstima termo da serie de Fibonacc: ");
        //int n = sc.nextInt();

        int primeiro = 1;
        int segundo = 2;
        int proximo = 0;

        while(proximo <= 500){

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            System.out.println(proximo);
        }
    }
}
