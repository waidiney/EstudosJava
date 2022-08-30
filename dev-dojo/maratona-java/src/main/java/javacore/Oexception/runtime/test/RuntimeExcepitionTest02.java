package javacore.Oexception.runtime.test;

public class RuntimeExcepitionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));
    }
    private static int divisao(int a, int b){
        if (b == 0){
            throw new RuntimeException("Argumento ilegal, nao pode ser 0");
        }
        try{
            return a/b ;
        }catch (RuntimeException e){ // foi usado RuntimeException pq ele eh uma super classe de ArithmeticException.
            e.printStackTrace();
        }
        return 0;
    }
}