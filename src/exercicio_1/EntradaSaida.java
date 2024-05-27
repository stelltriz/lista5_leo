package exercicio_1;

import java.util.Scanner;

public class EntradaSaida {
    static Scanner scanner = new Scanner(System.in);

    public static double[] receberNotas() {
        double[] notas = new double[2];
        for (int i = 0; i < 2; i++) {
            do {
                System.out.print("Insira sua nota " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
            } while (!Validacao.validarNota(notas[i])); // Valida a nota
        }
        return notas;
    }

    public static String receberTipoMedia() {
        System.out.print("Insira o tipo de (Aritmetica/Ponderada): ");
        return scanner.next();
    }

    public static double[] receberPesos() {
        double[] pesos = new double[2];
        System.out.print("Insira o peso da nota 1: ");
        pesos[0] = scanner.nextDouble();
        System.out.print("Insira o peso da nota 2: ");
        pesos[1] = scanner.nextDouble();
        return pesos;
    }
}