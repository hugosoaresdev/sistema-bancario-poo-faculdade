package encapsulamento.versao2;

public class Veiculo {

    private double carga;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return this.carga;
    }

    public double getCargaMaxima() {
        return this.cargaMaxima;
    }

    public boolean adicionarCaixa(double peso){
        if(peso < 0){
            return false;
        }

        if((this.carga + peso) < cargaMaxima){
            this.carga += peso;
            return true;
        } else {
            return false;
        }
    }
}
