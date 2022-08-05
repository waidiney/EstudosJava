package javacore.Hherança.Test;

import javacore.Hherança.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estatico da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estatico da sub classe é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço na memoria pro objeto da superclasse
    // 3 - Cada atributo de classe pai é inicializao com valores default ou o que for passada
    // 4 - Bloco de inicialização da super classe é executado na ordem que aparece
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaço na memoria pro objeto da subclasse
    // 7 - Cada atributo de classe é inicializao com valores default ou o que for passada
    // 9 - Bloco de inicialização daa subclasse é executado na ordem que aparece
    // 10 - Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Sevandija");
    }
}
