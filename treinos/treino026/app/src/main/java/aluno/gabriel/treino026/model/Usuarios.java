package aluno.gabriel.treino026.model;

public class Usuarios {
    private Integer id;
    private String nomeCompleto;
    private Integer registro;
    private String email;
    private String senha;

    public Usuarios(){}
    public Usuarios(String nomeCompleto, Integer registro, String email, String senha){
        this.setNomeCompleto(nomeCompleto);
        this.setRegistro(registro);
        this.setEmail(email);
        this.setSenha(senha);
    }

    public Integer getId(){
        return id;
    } public void setId(Integer id){
        this.id = id;
    } public String getNomeCompleto(){
        return nomeCompleto;
    } public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    } public Integer getRegistro(){
        return registro;
    } public void setRegistro(Integer registro){
        this.registro = registro;
    } public String getEmail(){
        return email;
    } public void setEmail(String email){
        this.email = email;
    } public String getSenha(){
        return senha;
    } public void setSenha(String senha){
        this.senha = senha;
    }
}
