package exercicio_3;
import java.util.Scanner;

public class EntradaSaida {
    static Scanner scanner = new Scanner(System.in);

    public static double receberSalario() {
        double salario;
        do {
            System.out.print("Insira seu salário atual: ");
            salario = scanner.nextDouble();
        } while (!Validacao.validarSalario(salario));
        return salario;
    }
    public static double receberValorEmprestimo() {
        double valorEmprestimo;
        do {
            System.out.print("Insira o valor do empréstimo desejado: ");
            valorEmprestimo = scanner.nextDouble();
        } while (!Validacao.validarValorEmprestimo(valorEmprestimo));
        return valorEmprestimo;
    }
    public static void mostrarDetalhesEmprestimo(double valorEmprestimo, double valorTotal, double valorParcela) {
        System.out.println("Empréstimo aprovado!");
        System.out.println("Empréstimo: " + valorEmprestimo);
        System.out.println("Valor Total (com juros): " + valorTotal);
        System.out.println("Parcela Mensal: " + valorParcela);
    }
}