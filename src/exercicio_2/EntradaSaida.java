package exercicio_2;

import java.util.Scanner;

public class EntradaSaida {
    static Scanner scanner = new Scanner(System.in);

    public static double receberSalario() {
        double salario;
        do {
            System.out.print("Insira o salário bruto: ");
            salario = scanner.nextDouble();
        } while (!Validacao.validarSalario(salario));
        return salario;
    }
    public static double receberHorasExtras() {
        System.out.print("Insira a quantidade de horas extras: ");
        return scanner.nextDouble();
    }
    public static void mostrarFolhaPagamento(double salarioBruto, double descontoINSS, double descontoIRPF, double descontoPlanoSaude, double acrescimoHorasExtras, double salarioLiquido) {
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto INSS: " + descontoINSS);
        System.out.println("Desconto IRPF: " + descontoIRPF);
        System.out.println("Desconto Plano de Saúde: " + descontoPlanoSaude);
        System.out.println("Acréscimo Horas Extras: " + acrescimoHorasExtras);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}