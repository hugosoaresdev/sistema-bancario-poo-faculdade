package banco;

public class ContaPoupanca extends Conta{
    private double taxaDeRendimento;

    ContaPoupanca(double saldoInicial, double rendimento){
        super(saldoInicial);
        this.taxaDeRendimento = rendimento;
    }
}
