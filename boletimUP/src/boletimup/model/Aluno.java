package boletimup.model;

public class Aluno {
    private String nome;
    private String matricula;
    private double notaA1;
    private double notaA2;
    private double notaA3;
    
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
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
        return matricula;
    }
    
    public void setra(String rmatricula){
        this.matricula = rmatricula;
    }

    public double getNotaA1() {
        return notaA1;
    }
    
    public void setNotaA1(double notaA1) {
        this.notaA1 = notaA1;
    }

    public double getNotaA2() {
        return notaA2;
    }
    
    public void setNotaA2(double notaA2) {
        this.notaA2 = notaA2;
    }

    public double getNotaA3() {
        return notaA3;
    }
    
    public void setNotaA3(double notaA3) {
        this.notaA3 = notaA3;
    }
}
