import java.util.Scanner;

public class contaService {

    contaService() {}

    Scanner scanf = new Scanner(System.in);

    //metodo retorna valor de tipo classe = conta
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
        conta_atual.setSaldo_cheque_especial(valor_cheque);
    }

    public void consultarSaldo(Conta conta_atual) {
        System.out.printf("Saldo da conta: %.2f ", conta_atual.getSaldo());
    }

    public void depositarValor(Conta conta_atual, double valor) {
        conta_atual.setSaldo(conta_atual.getSaldo() + valor);
        System.out.println("Transação concluída");
    }

    public void consultarChequeEspecialAprovado(Conta conta_atual) {
        System.out.printf("Valor do cheque especial aprovado: %.2f ", conta_atual.getCheque_especial());
    }

    public void consultarSaldoChequeEspecial(Conta conta_atual) {
        System.out.printf("O cheque especial está habilitado na conta\nSaldo do cheque: %.2f ", conta_atual.getSaldo_cheque_especial());
    }

    public void sacarValor(Conta conta_atual, valor) {
        if (valor > conta_atual) {
            System.out.println("Transação indeferida: saldo insuficiente");
        }
        else {

            /*se o debito = saldo em conta - o valor sacado for menor que o cheque especial, então foi debitado do cheque*/
            if (conta_atual.getSaldo() - valor < conta_atual.getCheque_especial()) {
                
                double debito = conta_atual.setSaldo(conta_atual.getSaldo() - valor);
               //calc retorna a diferença entre cheque e saldo atual= valor debitado
               double debitado_do_cheque = conta_atual.getCheque_especial() - conta_atual.getSaldo();
               conta_atual.setSaldo_cheque_especial(conta_atual.getSaldo_cheque_especial() - debitado_do_cheque);
            }
        }
    }

}
