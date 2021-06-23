public class exercicio4 {  
    public static void main(String[]args){
        int popA = 8000;
        int popB = 20000;
        int cont = 0;
        while (popA < popB){         
            popA += (popA/100) * 3;
            popB +=(popB/100) * 1.5;
        }
        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidades de anos: " + cont);         
    }
}