package banco;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private int numeroDeClientes;

    public Banco(){
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
        this.numeroDeClientes ++;
    }

    public Cliente getCliente(int id){
        return this.clientes.get(id);
    }

    public ArrayList<Cliente> getCliente(String nome, String Sobrenome){
        ArrayList<Cliente> encontrados = new ArrayList<>();

        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getNome().equals(nome) && clientes.get(i).getSobrenome().equals(Sobrenome)){
                encontrados.add(clientes.get(i));
            }
        }
        return encontrados;
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }
}
