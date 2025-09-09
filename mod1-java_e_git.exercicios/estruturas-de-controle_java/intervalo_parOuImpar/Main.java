import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanf = new Scanner(System.in);
        System.out.println("--- STS de intervalo par ou ímpar ---");
        System.out.println("*Digite dois valores (inteiros) distantes um do outro ");
        System.out.print("Número menor: ");
        int numMenor = scanf.nextInt();
        System.out.print("Número maior: ");
        int numMaior = scanf.nextInt();

        System.out.println("*Escolha entre as opções:\n1 - Par\n2 - Ímpar");
        int escolha_input = scanf.nextInt();

        int restoDivisao = 0;
        String tipoNumeros = "pares";
        if (escolha_input == 2) {
            restoDivisao = 1;
            tipoNumeros = "ímpares";
        }

        System.out.printf("os números %s no intervalo de %d e %d são:\n", tipoNumeros, numMaior, numMenor);
        for (int i=numMaior;i >= numMenor;i--){
            if (i % 2 == restoDivisao){
                System.out.printf("%d ", i);
            }
        }
    }
}
