package javacore.Oexception.test;

public class RuntimeExcepitionTest02 {
    public static void main(String[] args) {
        divisao(1,0);
    }

    /**
     *
     * @param a
     * @param b nao pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, nao pode ser 0");
        }
        try{
            return a/b ;
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        return a/b;
    }
}