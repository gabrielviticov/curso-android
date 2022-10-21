package aluno.gabriel.treino023.model;

public class Aluno {
    private Integer id;
    private String rgm;
    private String nome;
    private String dtaNascimento;
    private String sexo;
    private String email;
    private Integer senha;

    public Aluno(){}
    public Aluno(String rgm, String nome, String dtaNascimento, String sexo, String email, Integer senha){
        this.setRgm(rgm);
        this.setNome(nome);
        this.setDtaNascimento(dtaNascimento);
        this.setSexo(sexo);
        this.setEmail(email);
        this.setSenha(senha);
    }

    public Integer getId(){
        return id;
    } public void setId(Integer id){
        this.id = id;
    } public String getRgm(){
        return rgm;
    } public void setRgm(String rgm){
        this.rgm = rgm;
    } public String getNome(){
        return nome;
    } public void setNome(String nome){
        this.nome = nome;
    } public String getDtaNascimento(){
        return dtaNascimento;
    } public void setDtaNascimento(String dtaNascimento){
        this.dtaNascimento = dtaNascimento;
    } public String getSexo(){
        return sexo;
    } public void setSexo(String sexo){
        this.sexo = sexo;
    } public String getEmail(){
        return email;
    } public void setEmail(String email){
        this.email = email;
    } public Integer getSenha(){
        return senha;
    } public void setSenha(Integer senha){
        this.senha = senha;
    }
}
