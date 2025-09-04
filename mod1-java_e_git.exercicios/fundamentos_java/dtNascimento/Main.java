import java.time.LocalDate;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanf = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();

        System.out.print("Nome: ");
        String nome = scanf.nextLine();
        System.out.print("Ano de Nascimento: ");
        int anoNascimento = scanf.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.printf("\n[Registro]\nUsuário: %s\nIdade: %d", nome, idade);

    }
}