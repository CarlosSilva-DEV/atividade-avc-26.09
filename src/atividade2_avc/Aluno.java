package atividade2_avc;
public class Aluno extends Pessoa {
    private String RA;
    private String codAluno;
    
    
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
}