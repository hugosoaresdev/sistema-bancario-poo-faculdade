package banco;

public class Conta {
    protected double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double deposito){
        if(deposito > 0) {
            this.saldo += deposito;
            System.out.println("Depósito Efetuado: + R$" + deposito);
            System.out.println("Saldo: R$" + this.saldo);
        } else{
            System.out.println("ERRO ao Depositar");
        }
    }

    public boolean sacar(double amount){
        if(this.saldo > 0 && amount <= this.saldo){
            this.saldo -= amount;

            System.out.println("Saque Efetuado: - R$" + amount);
            System.out.println("Saldo: R$" + this.saldo);

            return true;
        } else{
            System.out.println("ERRO ao Sacar");

            return false;
        }
    }
}
