import java.util.Scanner;

public class exercicio14 {
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        
        int pares = 0;
        int impares = 0;

        for(int i = 0; i<10; i++){
            System.out.print("Digite 10 numero: ");
            int num = sc.nextInt();

            if (num % 2 == 0 ){
                pares++;
            }else{
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
