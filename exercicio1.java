package EstruturaDeRepeticao;

import java.util.Scanner;

public class exercicio1{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        boolean notaValida = false;

        do{
            System.out.println("Digite sua nota  ");
            double nota = sc.nextDouble();
            if(nota >=0 && nota <=10){
                notaValida = true;
                System.out.println("voce digitou: " + nota);
            }else {
                System.out.println("nota invalida, digite novamente.");
            }
        }while (!notaValida);
    }
}