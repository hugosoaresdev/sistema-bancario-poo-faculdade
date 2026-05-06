import encapsulamento.versao2.Veiculo;

public class TesteVeiculo2 {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo(10000);
        Veiculo veiculo2 = new Veiculo(109000);
        Veiculo veiculo3 = new Veiculo(900);

        System.out.println("Criando um veículo com carga máxima de " + veiculo.getCargaMaxima() + " kg");
        System.out.println("Adicionando Caixa número 1 (500kg) : " + veiculo.adicionarCaixa(500));
        System.out.println("Adicionando Caixa número 2 (250kg) : " + veiculo.adicionarCaixa(250));
        System.out.println("Adicionando Caixa número 3 (5000kg) : " + veiculo.adicionarCaixa(5000));
        System.out.println("Adicionando Caixa número 4 (4000kg) : " + veiculo.adicionarCaixa(4000));
        System.out.println("Adicionando Caixa número 5 (300kg) : " + veiculo.adicionarCaixa(300));
        System.out.println("A carga do veículo é " + veiculo.getCarga() + " kg");

        System.out.println("Criando um veículo com carga máxima de " + veiculo2.getCargaMaxima() + " kg");
        System.out.println("Adicionando Caixa número 1 (500kg) : " + veiculo2.adicionarCaixa(500));
        System.out.println("Adicionando Caixa número 2 (250kg) : " + veiculo2.adicionarCaixa(250));
        System.out.println("Adicionando Caixa número 3 (5000kg) : " + veiculo2.adicionarCaixa(5000));
        System.out.println("Adicionando Caixa número 4 (4000kg) : " + veiculo2.adicionarCaixa(4000));
        System.out.println("Adicionando Caixa número 5 (300kg) : " + veiculo2.adicionarCaixa(300));
        System.out.println("A carga do veículo é " + veiculo2.getCarga() + " kg");

        System.out.println("Criando um veículo com carga máxima de " + veiculo2.getCargaMaxima() + " kg");
        System.out.println("Adicionando Caixa número 1 (500kg) : " + veiculo2.adicionarCaixa(500));
        System.out.println("Adicionando Caixa número 2 (250kg) : " + veiculo2.adicionarCaixa(250));
        System.out.println("Adicionando Caixa número 3 (5000kg) : " + veiculo2.adicionarCaixa(5000));
        System.out.println("Adicionando Caixa número 4 (4000kg) : " + veiculo2.adicionarCaixa(4000));
        System.out.println("Adicionando Caixa número 5 (300kg) : " + veiculo2.adicionarCaixa(300));
        System.out.println("A carga do veículo é " + veiculo2.getCarga() + " kg");

        //pesquisaeprograduação // iniciação científica // Pró reitoria de pesquisa

    }
}
