package banco;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    ContaCorrente(double saldoInicial, double chequeEspecial){
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    ContaCorrente(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public boolean sacar(double amount) {
        if((this.saldo + this.chequeEspecial) >= amount){
            this.saldo -= amount;
            return true;
        } else{
            return false;
        }
    }
}
