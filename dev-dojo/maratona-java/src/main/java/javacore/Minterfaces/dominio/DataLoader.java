package javacore.Minterfaces.dominio;
// Interfaces criam metodos abstratos por padrao, portanto nao ha nescessidade de descrever isso no metdo como por exemplo onde esta seria escrito (public abstract void load) ficou apenas como void load.
// Quando se cria uma interface obrigatoriamente se declara como "public interface".
// A interface tem por padrao todos os metodos ja declarados como "public abstract", e precisam ter o simbolo ;
// Na classe que for usada como extends eh nescessario usar "implements e o nome da classe que ele extendeu, no caso DataLoader.
public interface DataLoader {
    void load();
}