package atividade2_avc;
public class Atividade2_avc {
    public static void main(String[] args) {
        Aluno p1 = new Aluno();
        p1.setNome("Carlos Silva");
        p1.setRA("5448000");
        p1.setCodAluno(p1.getNome(), p1.getRA());
        System.out.println(p1.getCodAluno());
    }
}