package aluno.gabriel.treino027.model;

public class Disciplinas {
    private Integer id;
    private String registroDisciplina;
    private String nomeDisciplina;
    private Integer cargaHoraria;

    public Disciplinas(){}
    public Disciplinas(String registroDisciplina, String nomeDisciplina, Integer cargaHoraria){
        this.setRegistroDisciplina(registroDisciplina);
        this.setNomeDisciplina(nomeDisciplina);
        this.setCargaHoraria(cargaHoraria);
    }

    public Integer getId(){
        return id;
    } public String getRegistroDisciplina(){
        return registroDisciplina;
    } public String getNomeDisciplina(){
        return nomeDisciplina;
    } public Integer getCargaHoraria(){
        return cargaHoraria;
    }

    public void setId(Integer id){
        this.id = id;
    } public void setRegistroDisciplina(String registroDisciplina){
        this.registroDisciplina = registroDisciplina;
    } public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    } public void setCargaHoraria(Integer cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
}
