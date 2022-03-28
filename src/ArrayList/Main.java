package ArrayList;

import Cliente.Cliente;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1= new Cliente("45251J", "Marta", 18);
        ArrayList <Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cliente1);
        listaClientes.remove(cliente1);
        //listaClientes.remove(0);
        listaClientes.add(new Cliente("11111J", "Marta", 20));
        listaClientes.add(new Cliente("12345K", "Juan", 31));
        System.out.println(listaClientes.size());
        System.out.println(listaClientes.isEmpty());
        System.out.println(listaClientes.contains(new Cliente("11111L")));
        System.out.println(listaClientes);

    }
}
