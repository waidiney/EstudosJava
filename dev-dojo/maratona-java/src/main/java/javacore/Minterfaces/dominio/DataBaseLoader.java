package javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados");
    }
    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na classe DataBaseLoader");
    }
}