package lista1;

import java.util.Scanner;

public class Exercicio1 {


    public static void main(String[] args) {
        int num;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = ler.nextInt();

        System.out.printf("Numero digitado: %d\n", num);
        System.out.printf("Sucessor: %d\n", num + 1);
        System.out.printf("Antecessor: %d\n", num - 1);

    }
}
