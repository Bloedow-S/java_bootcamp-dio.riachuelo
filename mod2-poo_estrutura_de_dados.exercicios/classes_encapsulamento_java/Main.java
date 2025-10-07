public class Main {
    public static void main(String[] args) {
       var cliente1 = new Cliente("Sabrina", "Bloedow", 589184);
       System.out.printf("id cliente: %d | nome: %s", cliente1.getId_cliente(), cliente1.getPrimeiro_nome());

       var conta1 = new contaService().criarConta(cliente1, 1000);
       System.out.printf("\nid conta: %d | saldo %.2f | cheque especial: %.2f", conta1.getId(), conta1.getSaldo(), conta1.getCheque_especial());

    }
}
