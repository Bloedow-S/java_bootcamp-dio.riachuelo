import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);

        System.out.println("--- Informe os dados do retângulo --- ");
        System.out.print("Base: ");
        double base = scanf.nextDouble();
        System.out.print("Altura: ");
        double altura = scanf.nextDouble();

        double area = base * altura;
        System.out.printf("Área do retângulo: %.2f", area);

    }
}
