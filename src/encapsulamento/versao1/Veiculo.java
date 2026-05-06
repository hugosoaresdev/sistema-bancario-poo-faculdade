package encapsulamento.versao1;

public class Veiculo {

    public double carga;
    public double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return this.carga;
    }

    public double getCargaMaxima() {
        return this.cargaMaxima;
    }
}
