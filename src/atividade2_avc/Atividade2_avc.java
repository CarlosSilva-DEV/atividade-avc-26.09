package atividade2_avc;
public class Atividade2_avc {
    public static void main(String[] args) {
        // TODO code application logic here
    }  
}

class Pessoa {
    String nome;
    int idade;
}

class Aluno extends Pessoa {
    String RA;
    String codAluno;
}

class Professor extends Pessoa {
    String especialidadeProf;
}

class Curso {
    String nomeCurso;
    int codCurso;
}

class Endereco {
    String logradouro;
    int numero;
    String cidade;
}