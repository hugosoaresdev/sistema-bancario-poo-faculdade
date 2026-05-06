package banco;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String sobrenome;
    private ContaPoupanca contaPoupanca;
    private ContaCorrente contaCorrente;


    public Cliente(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /*public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }*/

    /*public Conta getConta(int id){
        return contas.get(id);
    }*/

    /*public int getNumeroDeContas(){
        return contas.size();
    }*/

    public ContaPoupanca getContaPoupanca(){
        return this.contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public ContaCorrente getContaCorrente(){
        return this.contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    @Override
    public String toString(){
        return nome + " " + sobrenome;
    }
}
