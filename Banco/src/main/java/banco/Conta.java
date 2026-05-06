package banco;

public class Conta {
    protected double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean depositar(double deposito){
        if(deposito > 0) {
            this.saldo += deposito;

            return true;
        } else{

            return false;
        }
    }

    public boolean sacar(double amount){
        if(this.saldo > 0 && amount <= this.saldo){
            this.saldo -= amount;

            return true;
        } else{

            return false;
        }
    }
}
