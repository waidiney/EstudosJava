package javacore.Bintroducaometodos.dominio;

public class Curriculo {
    private String nome;
    private int idade;
    private String sexo;
    private String estadocivil;
    private String experiencia;
    private boolean apto;
    private boolean empregado;
    private String cargo;
    private int pretensao;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.estadocivil);
        System.out.println(this.experiencia);
        System.out.println(this.apto);
        System.out.println(this.empregado);
        System.out.println(this.cargo);
        System.out.println(this.pretensao);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setPretensao(int pretensao) {
        this.pretensao = pretensao;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getSexo(){
        return this.sexo;
    }
    public String getEstadocivil(){
        return this.estadocivil;
    }
    public String getExperiencia(){
        return this.experiencia;
    }
    public boolean getApto(){
        return this.apto;
    }
    public boolean getEmpregado(){
        return this.empregado;
    }
    public String getCargo(){
        return this.cargo;
    }
    public int getPretensao(){
        return this.pretensao;
    }
}