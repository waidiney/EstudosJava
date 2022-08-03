package javacore.Hherança.Test;

import javacore.Hherança.dominio.Endereco;
import javacore.Hherança.dominio.Funcionario;
import javacore.Hherança.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Endereço Rua Patativas quadra 3 casa 18");
        endereco.setCep("CEP 65000-058");
        Pessoa pessoa = new Pessoa("Saitama");
        pessoa.setCpf("CPF 0101010101010");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------------------------------------");

        Funcionario funcionario = new Funcionario("Away de Petrópoles");
        funcionario.setCpf("101010100101010");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
