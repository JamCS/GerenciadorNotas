package boletimup.model;

public class Aluno {
    private String nome;
    private String ra;
    
    public Aluno(String nome, String ra){
        this.nome = nome;
        this.ra = ra;
    }
    
    //métodos get/set para nome do aluno
    public String getnome(){
        return nome;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    //métodos get/set para ra do aluno
    public String getra(){
        return ra;
    }
    
    public void setra(String ra){
        this.ra = ra;
    }
}
