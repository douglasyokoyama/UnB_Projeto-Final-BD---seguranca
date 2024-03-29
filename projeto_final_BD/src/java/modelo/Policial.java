/*
 *             Projeto Final de Banco de Dados 2/2015
 * Professora: Maristela Terto de Holanda
 * Componentes:
 *                 Douglas Shiro Yokoyama      13/0024902
 *                 Marcelo Andre Winkler                 
 */
package modelo;

/**
 * CREATE TABLE policial
	(
	id_policial			integer(10) not null,
        nome				varchar(20) not null,
        titulo				varchar(20) not null,
        cep				varchar(15) not null,
        cidade				varchar(30) not null,
        bairro				varchar(30) not null,
        estado				varchar(2)  not null,
	PRIMARY KEY (id_policial)
	);
 */
public class Policial {
    //Lista de atributos
    private int id_policial;
    private String nome;
    private String titulo;
    private String cep;
    private String cidade;
    private String bairro;
    private String estado;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

        public String getBairro(){
        return bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Métodos get/set
    public int getId_policial() {
        return id_policial;
    }

    public void setId_policial(int id_policial) {
        this.id_policial = id_policial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
