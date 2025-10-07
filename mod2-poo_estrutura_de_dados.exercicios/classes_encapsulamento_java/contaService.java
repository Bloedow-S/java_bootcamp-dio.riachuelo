import java.util.Scanner;

public class contaService {

    Scanner scanf = new Scanner(System.in);

    //semelhante a um construtor mét. retorna conta
    public Conta criarConta(Cliente cliente, double saldo){
        var conta_atual = new Conta(cliente, saldo);
        atualizarChequeEspecial(conta_atual);
        return conta_atual;
    }

    public void atualizarChequeEspecial(Conta conta_atual) {
        double valor_cheque = 50;
        if (conta_atual.getSaldo() > 500) {
            valor_cheque = 0.5 * conta_atual.getSaldo();
        }

        conta_atual.setCheque_especial(valor_cheque);
        conta_atual.setSaldo(conta_atual.getSaldo() + valor_cheque);
    }

    public void consultarSaldo(Conta conta_atual) {
        System.out.printf("Saldo da conta: %.2f ", conta_atual.getSaldo());
    }

    public void depositarValor(Conta conta_atual) {
        System.out.print("\nDigite o valor a ser depositado: ");
        var valor = scanf.nextDouble();
        conta_atual.setSaldo(conta_atual.getSaldo() + valor);
        System.out.println("Transação concluída");
    }

}
