package lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int distancia, combustivel;
        double mediaConsumo;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida (em KM): ");
        distancia = ler.nextInt();
        System.out.println("Digite a quantidade de combustivel gasto (em Litros): ");
        combustivel = ler.nextInt();

        mediaConsumo = (double) distancia / combustivel;

        System.out.printf("A media de consumo por Km é de: %.2f km/l" ,mediaConsumo);

    }
}
