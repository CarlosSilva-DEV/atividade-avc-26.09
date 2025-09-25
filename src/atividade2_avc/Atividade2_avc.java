package atividade2_avc;
public class Atividade2_avc {
    public static void main(String[] args) {
        // instanciando 2 objetos com base na classe Aluno
        Aluno a1 = new Aluno("Carlos Silva", 21, "12345600", "Rua dos Devs", 30, "Java City");
        Aluno a2 = new Aluno("João Gomes", 24, "5489733", "Avenida Debug II", 450, "Sao Jose dos Frameworks");
        
        //instanciando 1 objeto com base na classe Professor
        Professor p1 = new Professor("Roberto Santos", 42, "Segurança da Informação");
        
        // instanciando 1 objeto com base na classe Curso
        Curso cursoTI = new Curso("Tecnologia da Informação", 001);
        
        //exibindo dados de alunos (nome, idade, RA, código, endereço)
        System.out.println("LISTA DE ALUNOS");
        System.out.println("-----------------------------------");
        a1.exibirDadosAluno();
        a2.exibirDadosAluno();
        
        //exibindo dados do professor (nome, idade, especialidade)
        System.out.println("");
        System.out.println("LISTA DE PROFESSORES");
        System.out.println("-----------------------------------");
        p1.exibirDadosProfessor();
        
        // adicionando os objetos a1 e a2 à lista de alunosdo curso de TI
        cursoTI.matricularAluno(a1);
        cursoTI.matricularAluno(a2);
        
        // exibindo lista de alunos matriculados no curso de TI
        cursoTI.exibirAlunosCurso();
    }
}