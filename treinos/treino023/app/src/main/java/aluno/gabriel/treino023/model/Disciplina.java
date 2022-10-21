package aluno.gabriel.treino023.model;

public class Disciplina {
    private Integer id;
    private String registro;
    private String nome;
    private Integer cargaHoraria;

    public Disciplina(){}
    public Disciplina(String registro, String nome, Integer cargaHoraria){
        this.setRegistro(registro);
        this.setNome(nome);
        this.setCargaHoraria(cargaHoraria);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
