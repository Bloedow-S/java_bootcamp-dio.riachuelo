import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);

        System.out.println("--- Qual é o valor de um lado de um determinado quadrado? ---");
        System.out.print("Digite: ");
        double ladoQuadrado = scanf.nextDouble();

        double area = ladoQuadrado * ladoQuadrado;
        System.out.printf("\nA área do quadrado é: %.2f", area);

    }
}
