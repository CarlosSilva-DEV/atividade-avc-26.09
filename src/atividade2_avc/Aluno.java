package atividade2_avc;
public class Aluno extends Pessoa {
    private String RA;
    private String codAluno;
    private Endereco endereco; // Composição 1:1
    
    // Construtor
    public Aluno(String nome, int idade, String RA, String logradouro, int numero, String cidade) {
        super(nome, idade);
        this.RA = RA;
        this.endereco = new Endereco(logradouro, numero, cidade);
    }
    
    // getters e setters
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public String getRA() {
        return this.RA;
    }
    public void setRA(String RA) {
        this.RA = RA;
    }
    
    public String getCodAluno() {
        return this.codAluno;
    }
    
    // método para gerar o código do aluno
    public String setCodAluno(String nome, String RA) {
        String iniciais = this.extrairIniciais(nome);
        return this.codAluno = iniciais + "_" + RA;
    }
    
    public String extrairIniciais(String nomeAluno) {
        if (nomeAluno == null || nomeAluno.trim().isEmpty()) {
            return "";
        }
        
        String[] partesNome = nomeAluno.trim().split("\\s+");
        StringBuilder iniciais = new StringBuilder();
        
        for (String parte : partesNome) {
            if (!parte.isEmpty()) {
                iniciais.append(parte.charAt(0));
            }
        }
        return iniciais.toString().toUpperCase();
    }
    
    public void exibirDadosAluno() {
        this.setCodAluno(this.getNome(), this.getRA()); //Gerando código do aluno pra exibir dentro do método
        
        System.out.println("Codigo do Aluno: " + this.getCodAluno());
        System.out.println("Nome do Aluno: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("RA do Aluno: " + this.getRA());
        System.out.println("");
        System.out.println("********ENDEREÇO COMPLETO********");
        System.out.println("Logradouro: " + this.getEndereco().getLogradouro());
        System.out.println("Numero: " + this.getEndereco().getNumero());
        System.out.println("Cidade: " + this.getEndereco().getCidade());
        System.out.println("-----------------------------------");
        System.out.println("");
    }
}
