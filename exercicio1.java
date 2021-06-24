import java.util.Scanner;

public class exercicio1{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua nota entre 0 e 10: ");
        int iVal = sc.nextInt();
        String sVal = String.valueOf(iVal);
       // System.out.println(sVal);

        
        if(iVal >=10){
            System.out.println("Sua nota foi "+ sVal);
        }     
    }
}