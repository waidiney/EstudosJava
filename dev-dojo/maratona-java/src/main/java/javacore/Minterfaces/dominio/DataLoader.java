package javacore.Minterfaces.dominio;
// Interfaces criam metodos abstratos por padrao, portanto nao ha nescessidade de descrever isso no metdo como por exemplo onde esta seria escrito (public abstract void load) ficou apenas como void load.
// Quando se cria uma interface obrigatoriamente se declara como "public interface".
// A interface tem por padrao todos os metodos ja declarados como "public abstract", e precisam ter o simbolo ;
// Na classe que for usada como extends eh nescessario usar "implements e o nome da classe que ele extendeu, no caso DataLoader.
// Interface e o contrato onde todos os metodos por padrao serao publicos e abstratos, se voce nao criar ele abstrato vc precisa criar ele DEFAULT,
// e precis prover uma implementacao quando ele e default,
// nao pode criar objetos de interface
//
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissoes");
    }
    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}