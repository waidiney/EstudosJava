package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Proxeneta",TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Sevandija",TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Sevandija",TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Sevandija",TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
