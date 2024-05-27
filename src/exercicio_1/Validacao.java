package exercicio_1;

public class Validacao {
    public static boolean validarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            return true;
        } else {
            System.out.println("Nota inválida! Informe novamente.");
            return false;
        }
    }
}