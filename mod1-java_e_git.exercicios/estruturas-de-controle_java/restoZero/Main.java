import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        var scanf = new Scanner(System.in);
        System.out.println("*Digite um número (inteiro) para iniciar o programa");
        System.out.print("Número 1: ");
        int num1 = scanf.nextInt();

        int outroNum = 0;
        while (outroNum % num1 == 0) {
            System.out.print("Digite outro número: ");
            outroNum = scanf.nextInt();

            if (outroNum < num1){
                outroNum = 0;
            }
        }
        System.out.printf("Número não divisível por %d detectado!", num1);
    }
}
