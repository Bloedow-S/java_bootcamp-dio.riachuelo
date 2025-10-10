
public class Conta {

    private final Identificator id = new Identificator();
    private final Cliente cliente;
    private double saldo;
    private double cheque_especial = 0;
    private double saldo_cheque_especial = 0;


    Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getId() {
        return id.getId();
    }

    public String getCliente() {
        return cliente.getPrimeiro_nome();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setCheque_especial(double cheque_especial) {
        this.cheque_especial = cheque_especial;
    }

    public double getCheque_especial() {
        return this.cheque_especial;
    }

    public void setSaldo_cheque_especial(double saldo_cheque_especial) { this.saldo_cheque_especial = saldo_cheque_especial; }

    public double getSaldo_cheque_especial() { return this.saldo_cheque_especial; }
}
