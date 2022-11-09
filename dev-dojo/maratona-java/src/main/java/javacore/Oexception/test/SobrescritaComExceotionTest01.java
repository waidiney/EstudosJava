package javacore.Oexception.test;


import javacore.Oexception.exception.test.dominio.Funcionario;
import javacore.Oexception.exception.test.dominio.LoginInvalidoException;
import javacore.Oexception.exception.test.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceotionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
