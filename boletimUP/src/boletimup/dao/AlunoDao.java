// A classe dao fica responsável por colocar os objetos nas listas para envio de ...
// ... dados dos objetos para o banco de dados
package boletimup.dao;

import boletimup.model.Aluno;
import  java.util.ArrayList;
import  java.util.List;

public class AlunoDao {
    private List<Aluno>  alunos = new ArrayList<>();
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public List<Aluno> listarAlunos(){
        return alunos;
    }
    
}
