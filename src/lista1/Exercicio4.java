package lista1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String sexo;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o sexo da pessoa [M][F]: ");
        sexo = ler.next().toUpperCase();

        if (sexo.equals("F")){
            System.out.println("Sexo Feminino");
        } else if (sexo.equals("M")) {
            System.out.println("Sexo Masculino");
        } else {
            System.out.println("Entrada inválida!");
        }
    }
}
