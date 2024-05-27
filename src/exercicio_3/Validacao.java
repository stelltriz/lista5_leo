package exercicio_3;

public class Validacao {
    public static boolean validarSalario(double salario) {
        if (salario >= 500 && salario <= 30000) {
            return true;
        } else {
            System.out.println("Salário inválido! Insira um valor entre 500 e 30000.");
            return false;
        }
    }

    public static boolean validarValorEmprestimo(double valorEmprestimo) {
        if (valorEmprestimo > 0 && valorEmprestimo <= 200000) {
            return true;
        } else {
            System.out.println("Valor de empréstimo inválido! Insira um valor até 200000.");
            return false;
        }
    }

    public static boolean validarEmprestimo(double salario, double valorEmprestimo, double valorParcela) {
        return valorParcela <= (salario * 0.15);
    }
}