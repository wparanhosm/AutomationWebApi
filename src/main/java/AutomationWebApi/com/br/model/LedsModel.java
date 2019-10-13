package AutomationWebApi.com.br.model;

public class LedsModel {

    private String nome;
    private int status;

    public LedsModel(String nome, int status) {
        this.nome = nome;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
