package atividade2_avc;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private int codCurso;
    private List<Aluno> listaAlunos; // Agregação 1:N
    
    // Construtor
    public Curso(String nomeCurso, int codCurso) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.listaAlunos = new ArrayList<>();
    }
    
    // getters e setters
    public String getNomeCurso() {
        return this.nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public int getCodCurso() {
        return this.codCurso;
    }
    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }
    
    // método pra adicionar alunos à lista
    public void matricularAluno(Aluno aluno) {
        if (!listaAlunos.contains(aluno)) { // não permite inserir um aluno ja adicionado na lista
            listaAlunos.add(aluno);
        } else {
            System.out.println("ERRO: Aluno já matriculado no curso.");
        }
    }
    
    public List<Aluno> getAlunos() { // getter pra retornar uma cópia da lista, mantendo o encapsulamento
        return new ArrayList<>(listaAlunos);
    }
    
    public void exibirAlunosCurso() {
        System.out.println("");
        System.out.println("");
        System.out.println("LISTA DE CURSOS");
        System.out.println("-----------------------------------");
        System.out.println("Código do Curso: " + this.getCodCurso());
        System.out.println("Nome do Curso: " + this.getNomeCurso());
        System.out.println("");
        System.out.println("");
        System.out.println("********ALUNOS MATRICULADOS********");
        System.out.println("");
        
        for (Aluno aluno : this.getAlunos()) {
            System.out.println("Código do Aluno: " + aluno.getCodAluno());
            System.out.println("Nome do Aluno: " + aluno.getNome());
            System.out.println("RA: " + aluno.getRA());
            System.out.println("");
        }
        System.out.println("-----------------------------------");
    }
}