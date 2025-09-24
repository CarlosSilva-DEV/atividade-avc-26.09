package atividade2_avc;
public class Atividade2_avc {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Carlos Silva", 21, "12345600", "Rua dos Devs", 30, "Java City");
        Aluno a2 = new Aluno("João Gomes", 24, "5489733", "Avenida Debug II", 450, "Sao Jose dos Frameworks");
        
        a1.exibirDadosAluno();
        a2.exibirDadosAluno();
    }
}