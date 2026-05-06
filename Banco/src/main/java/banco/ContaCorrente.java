package banco;

public class ContaCorrente extends Conta{
    private  ContaPoupanca protecaoContaPoupanca;

    ContaCorrente(double saldoInicial, ContaPoupanca contaPoupanca){
        super(saldoInicial);
        this.protecaoContaPoupanca = contaPoupanca;
    }

    ContaCorrente(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public boolean sacar(double amount) {
        if(saldo >= amount){
            saldo -= amount;

            return true;
        } else if (protecaoContaPoupanca != null) {
            double diferenca = amount - saldo;

            if(protecaoContaPoupanca.saldo >= diferenca){
                saldo = 0;
                protecaoContaPoupanca.saldo -= diferenca;

                return true;
            } else {

                return false;
            }
        } else{

            return false;
        }
    }

    public ContaPoupanca getContaPoupanca(){
        return this.protecaoContaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca){
        this.protecaoContaPoupanca = contaPoupanca;
    }
}
