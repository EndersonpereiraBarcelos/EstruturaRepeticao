import java.util.Scanner;

public class exercico17 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print( "Informe numero: ");
        int numero = sc.nextInt();
        System.out.println( "Numero fatorial " + numero + " é: " + fatorial( numero ) );      
        }
        
        public static int fatorial( int numeroFatorial ) {
        int fact = 1;
        for( int i = 1; i <= numeroFatorial; i++ ) {
           fact *= i;
        }
        
        return fact;
        
    }        
}