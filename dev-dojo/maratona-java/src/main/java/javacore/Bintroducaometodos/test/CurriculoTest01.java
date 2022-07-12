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
    }
}
