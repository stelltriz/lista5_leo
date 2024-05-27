package exercicio_1;

public class Calculo {
    public static double calcularMediaAritmetica(double[] notas) {
        return (notas[0] + notas[1]) / 2;
    }

    public static double calcularMediaPonderada(double[] notas, double[] pesos) {
        return (notas[0] * pesos[0] + notas[1] * pesos[1]) / (pesos[0] + pesos[1]);
    }
}