package banco.dominio;

public class ContaPoupanca extends Conta{
    private double taxaDeRendimento;

    public ContaPoupanca(double saldoInicial, double rendimento){
        super(saldoInicial);
        this.taxaDeRendimento = rendimento;
    }
}
