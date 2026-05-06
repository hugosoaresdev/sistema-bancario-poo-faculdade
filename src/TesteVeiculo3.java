import encapsulamento.versao3.Veiculo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteVeiculo3 {
    public static void main(String[] args) {

        //pesquisaeprograduação // iniciação científica // Pró reitoria de pesquisa

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a carga máxima: ");
        double cMax = scanner.nextDouble();
        Veiculo veiculo1 = new Veiculo(cMax);

        double cargas;

        System.out.println("Criando um veículo com carga máxima de " + veiculo1.getCargaMaxima() + " kg");
        System.out.print("Primeira Carga: ");
        cargas = scanner.nextDouble();
        System.out.println("Adicionando Caixa número 1 (500kg) : " + veiculo1.adicionarCaixa(cargas));
        System.out.print("Segunda Carga: ");
        cargas = scanner.nextDouble();
        System.out.println("Adicionando Caixa número 2 (250kg) : " + veiculo1.adicionarCaixa(cargas));
        System.out.print("Terceira Carga: ");
        cargas = scanner.nextDouble();
        System.out.println("Adicionando Caixa número 3 (5000kg) : " + veiculo1.adicionarCaixa(cargas));
        System.out.print("Quarta Carga: ");
        cargas = scanner.nextDouble();
        System.out.println("Adicionando Caixa número 4 (4000kg) : " + veiculo1.adicionarCaixa(cargas));
        System.out.print("Quinta Carga: ");
        cargas = scanner.nextDouble();
        System.out.println("Adicionando Caixa número 5 (300kg) : " + veiculo1.adicionarCaixa(cargas));

        System.out.println("A carga do veículo é " + veiculo1.getCarga() + " kg");
        System.out.println("Teste " + veiculo1.testeGetCarga() + " Newtons");

    }
}
