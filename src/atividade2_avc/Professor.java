package atividade2_avc;
public class Professor extends Pessoa {
    private String especialidade;
    
    // Construtor
    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }
    
   // getters e setters
    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public void exibirDadosProfessor() {
        System.out.println("Nome do Professor: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("-----------------------------------");
    }
}