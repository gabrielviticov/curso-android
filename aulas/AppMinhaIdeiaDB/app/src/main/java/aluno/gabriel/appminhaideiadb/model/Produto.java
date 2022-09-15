package aluno.gabriel.appminhaideiadb.model;

public class Produto {
    private Integer id;
    private String nome;
    private String fabricante;

    public Produto(String nome, String fabricante){
        this.setNome(nome);
        this.setFabricante(fabricante);
    }
    public Integer getId(){
        return id;
    }
    public String getNome(){
        return nome;
    } public void setNome(String nome){
        this.nome = nome;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public String getFabricante(){
        return fabricante;
    } public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
}
