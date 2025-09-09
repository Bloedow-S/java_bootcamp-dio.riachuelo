import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        var scanf = new Scanner(System.in);
        System.out.println("--- Calculadora IMC ---");
        System.out.print("Digite a sua altura: ");
        double altura = scanf.nextDouble();
        System.out.print("Digite o seu peso: ");
        double peso = scanf.nextDouble();

        double imc = peso/(altura*altura);

        if (imc <= 18.5) System.out.print("(!) Abaixo do peso");
        else if (imc <= 24.9) System.out.print("Peso ideal!");
        else if (imc <= 29.9) System.out.print("Levemente acima do peso");
        else if (imc <= 34.9) System.out.print("(!) Obesidade grau 1");
        else if (imc <= 39.9) System.out.print("(!) Obesidade grau 2");
        else System.out.print("(!) Obesidade grau 3");

    }
}
