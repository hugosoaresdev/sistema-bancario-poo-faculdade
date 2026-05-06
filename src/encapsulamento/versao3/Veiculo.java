package encapsulamento.versao3;

public class Veiculo {

    private double carga;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }
    public Veiculo(){}

    public double getCarga() {
        return newtonsParaQuilos(this.carga);
    }

    public double testeGetCarga(){
        return this.carga;
    }

    public double getCargaMaxima() {
        return this.cargaMaxima;
    }

    public boolean adicionarCaixa(double peso){
        if(peso < 0){
            return false;
        }

        if((newtonsParaQuilos(this.carga) + peso) < cargaMaxima){
            this.carga += quilosParaNewtons(peso);
            return true;
        } else {
            return false;
        }
    }

    private double newtonsParaQuilos(double peso){
        return carga / 9.8;
    }

    private double quilosParaNewtons(double peso){
        return peso * 9.8;
    }

}
