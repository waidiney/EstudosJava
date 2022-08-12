package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;

// Pacote servico foi criado porque qaundo trabalhamos com arquitetura NVC( ou a regra de negocios) , voce sepera o modelo (dominio) que representa o banco de dados, com o que voce vai vizualizar( o test), neste caso a regra de negocios e fazer um modelo pra calular os impostos.
public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador "+computador.getNome());
        System.out.println("Valor "+computador.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate "+tomate.getNome());
        System.out.println("Valor "+tomate.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }
}
