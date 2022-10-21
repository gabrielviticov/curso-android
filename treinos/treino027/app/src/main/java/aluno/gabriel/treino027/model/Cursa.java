package aluno.gabriel.treino027.model;

public class Cursa {
    private Integer id;
    private String graduacao;
    private String semestreTurma;
    private Integer idAluno;
    private Integer idDisciplina;

    public Cursa(){}
    public Cursa(String graduacao, String semestreTurma, Integer idAluno, Integer idDisciplina){
        this.setGraduacao(graduacao);
        this.setSemestreTurma(semestreTurma);
        this.setIdAluno(idAluno);
        this.setIdDisciplina(idDisciplina);
    }

    public Integer getId(){
        return id;
    } public String getGraduacao(){
        return graduacao;
    } public String getSemestreTurma(){
        return semestreTurma;
    } public Integer getIdAluno(){
        return idAluno;
    } public Integer getIdDisciplina(){
        return idDisciplina;
    }

    public void setId(Integer id){
        this.id = id;
    } public void setGraduacao(String graduacao){
        this.graduacao = graduacao;
    } public void setSemestreTurma(String semestreTurma){
        this.semestreTurma = semestreTurma;
    } public void setIdAluno(Integer idAluno){
        this.idAluno = idAluno;
    } public void setIdDisciplina(Integer idDisciplina){
        this.idDisciplina = idDisciplina;
    }
}
