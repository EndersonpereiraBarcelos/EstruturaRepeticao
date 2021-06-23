import java.util.Scanner;

public class exercicio2 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        boolean infoValidas = false;

        do{
            System.out.println("Entre com seu nome de usuario: ");
            String nomeUser = sc.next();

            System.out.println("Entre com a sua senha: ");
            String senha = sc.next();

            if(nomeUser.equalsIgnoreCase(senha)){
                System.out.println("Senha igual usuario, digite novamente.");
            }else{
                infoValidas = true;
                System.out.println("Senha e usuarios validos");

            }
    }while(!infoValidas);
    
}
}