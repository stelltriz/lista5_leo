package exercicio_1;

public class Resultado {
    public static void mostrarResultado(double media) {
        if (media >= 7) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else {
            System.out.println("Aluno reprovado! Média: " + media);
        }
    }
}