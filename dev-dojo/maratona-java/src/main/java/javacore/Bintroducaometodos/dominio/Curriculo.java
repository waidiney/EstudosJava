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
}