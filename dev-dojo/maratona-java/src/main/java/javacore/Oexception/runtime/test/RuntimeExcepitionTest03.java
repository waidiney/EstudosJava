package javacore.Oexception.runtime.test;

public class RuntimeExcepitionTest03 {
    public static void main(String[] args) {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo arquivo");

        }catch (Exception e) {
            System.out.println("Fechando recurso liberado pelo SO");
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberdado pelo SO");
        }
    }
}
