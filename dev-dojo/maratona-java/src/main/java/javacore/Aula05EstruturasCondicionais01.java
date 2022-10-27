package javacore;


public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
    int idade = 17;
    boolean isAutorizadoComparBebida = idade >= 18;
    if (isAutorizadoComparBebida){
        System.out.println("Autorizado comprar bebida alcólica");
    }else {
        System.out.println("Não Autorizado a comprar bebida alcólica");
    }
    if (isAutorizadoComparBebida == false){
        System.out.println("Não Autorizado a comprar bebida alcólica");
    }
        System.out.println("Fora do if");
    }
}
