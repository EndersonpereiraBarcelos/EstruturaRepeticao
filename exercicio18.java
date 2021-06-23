import java.util.Scanner;

public class exercicio18 {

    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite primeiro numero: ");
            int num1 = sc.nextInt();
        System.out.print("Digite segundo numero: ");
            int num2 = sc.nextInt();
        System.out.print("Digite terceiro numero: ");    
        int num3 = sc.nextInt();
           

        if(num1 > num2 && num1 > num3){
                System.out.println("O numero " + num1 + " é o maior");
        }else if(num2 > num1 && num2 > num3){
                System.out.println("O numero " + num2 + " é o maior");
        }else if (num3 > num1 && num3 >num2){
                System.out.println("O numero " + num3 + " é o maior");
        }else {
                System.out.println("Os numeros são os mesmos");
        }
        if(num1 < num2 && num1 < num3){
                System.out.println("O numero " + num1 + " é o menor");
        }else if(num2 < num1 && num2 < num3){
                System.out.println("O numero " + num2 + " é o menor");
        }else if (num3 < num1 && num3 < num2){
                System.out.println("O numero " + num3 + " é o menor");
        }
        System.out.println("A soma dos numero");
        System.out.print( num1 + num2 + num3);
    }
}