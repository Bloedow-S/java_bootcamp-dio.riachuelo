public class Cliente {

    private final Identificator id_cliente = new Identificator();
    private String primeiro_nome;
    private String ultimo_nome;
    int cpf;

    Cliente(String primeiro_nome, String ultimo_nome, int cpf ){
        this.primeiro_nome = primeiro_nome;
        this.ultimo_nome = ultimo_nome;
        this.cpf = cpf;
    }

    public int getId_cliente() {
        return id_cliente.getId();
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getPrimeiro_nome() {
        return this.primeiro_nome;
    }

    public void setUltimo_nome(String ultimo_nome) {
        this.ultimo_nome = ultimo_nome;
    }

    public String getUltimo_nome(){
        return ultimo_nome;
    }
}
