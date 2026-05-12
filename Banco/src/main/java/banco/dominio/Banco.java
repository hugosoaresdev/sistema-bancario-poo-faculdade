package banco.dominio;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private static Banco banco;

    private Banco(){
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);

    }

    public Cliente getCliente(int id){
        return this.clientes.get(id);
    }

    public ArrayList<Cliente> getCliente(String nome, String Sobrenome){
        ArrayList<Cliente> encontrados = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome) && cliente.getSobrenome().equals(Sobrenome)) {
                encontrados.add(cliente);
            }
        }
        return encontrados;
    }

    public int getNumeroDeClientes() {
        return clientes.size();
    }

    public static Banco getBanco(){
        if(banco == null){
            banco = new Banco();
        }
        return banco;
    }
}
