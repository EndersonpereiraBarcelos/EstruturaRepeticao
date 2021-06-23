import java.util.Scanner;

public class exercicio12 {

    public static void main(String[]args){
        Scanner tabuada = new Scanner(System.in);
        System.out.print("Digite valor da multiplicação: ");

        int valor = tabuada.nextInt();
        for(int i = 0; i < 11; i++) {
            System.out.println(valor + " X " + i + " = " + (valor * i));
        }
    }
}
