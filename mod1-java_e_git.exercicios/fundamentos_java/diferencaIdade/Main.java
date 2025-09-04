import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);

        System.out.println("* Cálculo para história/registro familiar");
        System.out.println("--- Digite os dados solicitados ---");

        System.out.print("(Pessoa 1) Nome: ");
        String nome1 = scanf.nextLine();
        System.out.print("(Pessoa 1) Idade: ");
        int idade1 = scanf.nextInt();

        //Elimina \n do int
        scanf.nextLine();

        System.out.print("(Pessoa 1) Parêntesco [ex: mãe]: ");
        String parentesco1 = scanf.nextLine();

        System.out.print("\n(Pessoa 2) Nome: ");
        String nome2 = scanf.nextLine();
        System.out.print("(Pessoa 2) Idade: ");
        int idade2 = scanf.nextInt();

        scanf.nextLine();

        System.out.print("(Pessoa 2) Parêntesco [ex: mãe]: ");
        String parentesco2 = scanf.nextLine();

        System.out.printf("\nA diferença de idade entre %s:%s e %s:%s é = %d", parentesco1, nome1, parentesco2, nome2, Math.abs(idade1 - idade2));
    }
}
