import encapsulamento.versao1.Veiculo;

public class TesteVeiculo1 {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo(10000);

        System.out.println("Criando um veículo com carga máxima de " + veiculo.getCargaMaxima() + " kg");
        System.out.println("Adicionando Caixa número 1 (500kg)");
        veiculo.carga += 500;
        System.out.println("Adicionando Caixa número 2 (250kg)");
        veiculo.carga += 250;
        System.out.println("Adicionando Caixa número 3 (5000kg)");
        veiculo.carga += 5000;
        System.out.println("Adicionando Caixa número 4 (4000kg)");
        veiculo.carga += 4000;
        System.out.println("Adicionando Caixa número 5 (300kg)");
        veiculo.carga += 300;

        System.out.println("A carga do veículo é " + veiculo.carga + " kg");

    }
}
