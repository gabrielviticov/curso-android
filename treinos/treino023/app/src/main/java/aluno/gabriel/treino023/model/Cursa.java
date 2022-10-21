package aluno.gabriel.treino023.model;

public class Cursa {
    private Integer id;
    private String curso;
    private String turma;
    private Integer idAluno;
    private Integer idDisciplina;

    public Cursa(){}
    public Cursa(String curso, String turma, Integer idAluno, Integer idDisciplina){
        this.setCurso(curso);
        this.setTurma(turma);
        this.setIdAluno(idAluno);
        this.setIdDisciplina(idDisciplina);
    }

    public Integer getId(){
        return id;
    } public void setId(Integer id){
        this.id = id;
    } public String getCurso(){
        return curso;
    } public void setCurso(String curso){
        this.curso = curso;
    } public String getTurma(){
        return turma;
    } public void setTurma(String turma){
        this.turma = turma;
    } public Integer getIdAluno(){
        return idAluno;
    } public void setIdAluno(Integer idAluno){
        this.idAluno = idAluno;
    } public Integer getIdDisciplina(){
        return idDisciplina;
    } public void setIdDisciplina(Integer idDisciplina){
        this.idDisciplina = idDisciplina;
    }
}
