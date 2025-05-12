package boletimup.controller;

import boletimup.model.Aluno;
import boletimup.dao.AlunoDao;
import java.util.List;

public class AlunoController {
    private AlunoDao alunoDao = new AlunoDao();
    
    public void cadastrasAluno(String nome, String ra) {
        Aluno aluno = new Aluno(nome,ra);
        alunoDao.adicionarAlunos(aluno);
    }
    
    public List<Aluno> getAluno(){
        return alunoDao.listarAlunos();
    }
}
