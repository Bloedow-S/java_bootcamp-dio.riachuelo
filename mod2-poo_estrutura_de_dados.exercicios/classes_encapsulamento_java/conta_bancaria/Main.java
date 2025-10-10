import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        var cliente1 = new Cliente("Sabrina", "Bloedow", 589184);
        System.out.printf("id cliente: %d | nome: %s", cliente1.getId_cliente(), cliente1.getPrimeiro_nome());

        var service = new contaService();
        var conta1 = service.criarConta(cliente1, 1000);


        System.out.printf("\nid conta: | cheque especial: %.2f", conta1.getCheque_especial());
        service.consultarSaldo(conta1);
        System.out.print("\nDigite o valor a ser depositado: ");
        var valor = scanf.nextDouble();
        service.depositarValor(conta1, valor);
        service.consultarSaldo(conta1);
    }
}
