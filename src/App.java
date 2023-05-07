import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int digitado1, digitado2;
        boolean ordemCrescente, ordemDecrescente;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois valores inteiros entre -2.147.483.648 e 2.147.483.647 (inclusive) ");
        digitado1 = sc.nextInt();
        digitado2 = sc.nextInt();
        ordemCrescente = ( digitado1 < digitado2);
        ordemDecrescente = ( digitado1 > digitado2);
        if(ordemCrescente){
            System.out.println("Os valores digitados estão em ordem crescente. ");
        }else if(ordemDecrescente){
            System.out.println("Os valores digitados estão em ordem decrescente. ");
        }else{
            System.out.println(" Valores Iguais. ");
        }
    }
}
