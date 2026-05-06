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

    public void tipoDasContas(Cliente cliente){
        for (int i = 0; i < cliente.getNumeroDeContas(); i++ ) {
            Conta conta = cliente.getConta(i);
            String  tipoConta = "";

            if(conta instanceof ContaPoupanca){
                tipoConta = "Conta Poupança";
            }

            if(conta instanceof ContaCorrente){
                tipoConta = "Conta Corrente";
            }

            // Exibe o saldo da conta
            System.out.println("O saldo da " + tipoConta + " é de R$ " + conta.getSaldo());
        }
    }

    public void exibirDetalhes(ArrayList<Cliente> clientes){
        System.out.println("Temos "+ clientes.size() + " cliente(s) com o nome fornecido");
        System.out.println();

        for (int i = 0; i < clientes.size(); i++){
            System.out.println("Cliente " + (i+1) + " ...: " + clientes.get(i));
            Cliente cliente = clientes.get(i);
            tipoDasContas(cliente);
            System.out.println();
        }
    }
}
