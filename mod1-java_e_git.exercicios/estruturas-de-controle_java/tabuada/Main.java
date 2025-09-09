import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("--- TABUADA ---");
        System.out.print("Digite um número: ");
        int num_input = scanner.nextInt();

        for (int i = 0;i<=10;i++){
            System.out.printf("%d x %d = %d\n", i, num_input, i*num_input);
        }
    }

}
