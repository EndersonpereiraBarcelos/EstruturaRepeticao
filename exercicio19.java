import java.util.Scanner;

public class exercicio19 {

    public static void main(String[]args){


        Scanner sc = new Scanner(System.in);
        int num, maior = 0, menor = 100, soma = 0;
        int Maior = 0, Menor = 0, i;
        
        for(i = 0; i < 3; i++){
            System.out.println("Digite um número entre 0 e 100");
            num = sc.nextInt();
            
            // validação
            if( (num < 1) || (num > 100) ){
                i = i - 1;
            } else{
                // armazena os nº digitados
                soma = soma + num;

                // armazena o maior nº
                if(num > maior){
                    maior = num;
                    Maior++;
                }

                // armazena o menor nº
                if(num < menor){
                    menor = num;
                    Menor++;
                }   
            
            } // fim validação
        } // fim for
        
        System.out.println("O maior nº digitado foi " + maior);
        System.out.println("O menor nº digitado foi " + menor);
        System.out.println("A soma é " + soma);
        
    } // fim class main
} // fim class principal