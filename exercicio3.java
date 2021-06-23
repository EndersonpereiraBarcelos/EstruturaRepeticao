import java.util.Scanner;

public class exercicio3 {
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do{
            System.out.println("Digite seu nome: ");
            nome = sc.next();

            if (nome.length() >= 3 ){
                infoValida = true;
            }else {
                System.out.println("nome de precisa no minino 3 caracteres.");

            }
        }while(!infoValida);

        infoValida = false;
        do{
            System.out.println("Digite sua idade ");
                idade = sc.nextInt();

            if (idade >= 0 && idade <=150 ){
                infoValida = true;
            }else {
                System.out.println("Idade precisa ser entre 0 a 150");

            }
        }while(!infoValida);

        infoValida = false;

        do{
            System.out.println("Digite seu salario ");
                salario = sc.nextDouble();

            if (salario >= 0){
                infoValida = true;
            }else {
                System.out.println("Salario ");

            }
        }while(!infoValida);

        infoValida = false;

        do{
            System.out.println("Digite seu sexo");
                sexo = sc.next();

            if (sexo.equalsIgnoreCase("f")  || sexo.equalsIgnoreCase("m")){
                infoValida = true;
            }else {
                System.out.println("Sexo precisa ser 'f' ou 'm'. ");

            }
        }while(!infoValida);

        infoValida = false;

        do{
            System.out.println("Digite seu estado civil");
                estadoCivil = sc.next();

            if (estadoCivil.equalsIgnoreCase("s")  
                || estadoCivil.equalsIgnoreCase("c") 
                || estadoCivil.equalsIgnoreCase("v")
                || estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            }else {
                System.out.println("O estado civil precisa ser 's', 'c',  'v' ou 'd' ");

            }
        }while(!infoValida);


        System.out.println("As Sequintes informações foram coletadas: ");
        System.out.println("nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("salario: " + salario);
        System.out.println("sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);


    }
}