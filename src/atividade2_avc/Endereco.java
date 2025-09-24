package atividade2_avc;
public class Endereco {
    private String logradouro;
    private int numero;
    private String cidade;
    
    // Construtor
    public Endereco(String logradouro, int numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }
    
    public String getLogradouro() {
        return this.logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}