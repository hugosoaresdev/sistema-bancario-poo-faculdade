package banco.dominio;

public class ContaCorrente extends Conta{
    private  double chequeEspecial;

    public ContaCorrente(double saldoInicial, double chequeEspecial){
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(){
        super(0);
        this.chequeEspecial = 0;
    }

    @Override
    public boolean sacar(double amount) {
        if(saldo >= amount){
            saldo -= amount;

            return true;
        } else if(saldo + chequeEspecial >= amount){
            double diferenca = amount - saldo;
            saldo = 0;
            chequeEspecial -= diferenca;

            return true;
        } else {

            return false;
            }
    }

    public double getChequeEspecial(){
        return this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }
}
