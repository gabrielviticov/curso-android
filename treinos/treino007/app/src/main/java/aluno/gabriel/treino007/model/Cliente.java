package aluno.gabriel.treino007.model;

public class Cliente {
    private Integer id;
    private String nome;
    private String email;
    private String sexo;

    public Cliente(){}
    public Cliente(String nome, String email, String sexo){
        this.setNome(nome);
        this.setEmail(email);
        this.setSexo(sexo);
    }

    public Integer getId(){
        return id;
    } public String getNome(){
        return nome;
    } public String getEmail(){
        return email;
    } public String getSexo(){
        return sexo;
    }

    public void setId(Integer id){
        this.id = id;
    } public void setNome(String nome){
        this.nome = nome;
    } public void setEmail(String email){
        this.email = email;
    } public void setSexo(String sexo){
        this.sexo = sexo;
    }
}
