package javacore.Dconstrutores.dominio.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //------------------------------------------------------------------------------------------
    //Dentro desta área está representado um construtor
    public Anime(String nome, String tipo, int episodios, String genero) {
        System.out.println("Dentro do Construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(){

    }
    //-------------------------------------------------------------------------------------------
    // Trecho abaixo removido, pois agora estamos chamando e configurando o objeto direto no construtor
    //  public void init(String nome, String tipo, int episodios) {
    //  this.nome = nome;
    //  this.tipo = tipo;
    //  this.episodios = episodios;
    //  }

    //  public void init(String nome, String tipo, int episodios, String genero) {
    //  this.init(nome, tipo, episodios);
    //  this.genero = genero;
    //  }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero(String ação) {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getGenero() {
        return this.genero;
    }

}