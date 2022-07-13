package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Curriculo;
public class CurriculoTest01 {
    public static void main(String[] args) {
        Curriculo curriculo = new Curriculo();
        curriculo.setNome("Waidiney");
        curriculo.setIdade(34);
        curriculo.setSexo("Masculino");
        curriculo.setEstadocivil("Casado");
        curriculo.setExperiencia("6 meses de experiência");
        curriculo.setApto(true);
        curriculo.setEmpregado(false);
        curriculo.setCargo("Estagiário");
        curriculo.setPretensao(5000);
        curriculo.imprime();
        System.out.println("______________________________________________________________________________");
        System.out.println(curriculo.getNome());
        System.out.println(curriculo.getIdade());
        System.out.println(curriculo.getSexo());
        System.out.println(curriculo.getEstadocivil());
        System.out.println(curriculo.getExperiencia());
        System.out.println(curriculo.getApto());
        System.out.println(curriculo.getEmpregado());
        System.out.println(curriculo.getCargo());
        System.out.println(curriculo.getPretensao());
    }
}
