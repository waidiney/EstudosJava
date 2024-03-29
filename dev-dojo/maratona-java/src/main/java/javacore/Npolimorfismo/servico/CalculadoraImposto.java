package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;

// Pacote servico foi criado porque quando trabalhamos com arquitetura NVC( ou a regra de negocios) , voce separa
// o modelo (dominio) que representa o banco de dados, com o que voce vai vizualizar( o test), neste caso a regra
// de negocios e fazer um modelo pra calular os impostos.
public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        produto.calcularImposto();
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) { // << se o produto for uma instancia de tomate, entao sera executado o codigo.
            Tomate tomate = (Tomate) produto; // <<< Pra faze esse casting de uma superclasse pra uma subclasse tem que
            // colocar entre parenteses a variavel de referencia pra confirmar pro java que de fato e essa variavel que
            // vc ta chamando.
            System.out.println(tomate.getDataValidade());
        }
    }
}
