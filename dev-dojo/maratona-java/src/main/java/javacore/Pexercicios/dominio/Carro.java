package javacore.Pexercicios.dominio;

public class Carro {
     private int valor = 40000;

     public int getValor() {
          return valor;
     }

     @Override
     public String toString() {
          return "Carro{" +
                  "valor=" + valor +
                  '}';
     }

     public void setValor(int valor) {
          this.valor = valor;
     }
}
