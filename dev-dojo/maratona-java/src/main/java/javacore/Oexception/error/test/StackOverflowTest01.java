package javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    //metodos criados unicamente para chamar o erro StackOverfllow, que eh quando um metodo estouta a memoria disponivel para a stack java.
    public static void recursividade(){
        recursividade();
    }
}
