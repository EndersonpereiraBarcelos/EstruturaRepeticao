import java.util.Scanner;

public class exercicio13 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a base: ");
        int base = sc.nextInt();

        System.out.print("Entre com a potencia: ");
        int pot = sc.nextInt();

        int resultado = base;

        for (int i=0; i<pot; i++){
            resultado *= base;
        }

        System.out.print("Resultado: " + resultado);
    }
    
}
