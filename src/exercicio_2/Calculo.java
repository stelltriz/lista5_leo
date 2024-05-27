package exercicio_2;

public class Calculo {
    public static double calcularINSS(double salarioBruto) {
        return salarioBruto * 0.20;
    }

    public static double calcularIRPF(double salarioBruto) {
        return salarioBruto * 0.10;
    }

    public static double calcularPlanoSaude(double salarioBruto) {
        return salarioBruto * 0.05;
    }

    public static double calcularHorasExtras(double salarioBruto, double horasExtras) {
        double valorHora = salarioBruto / 160;
        return horasExtras * valorHora * 1.5;
    }

    public static double calcularSalarioLiquido(double salarioBruto, double descontoINSS, double descontoIRPF, double descontoPlanoSaude, double acrescimoHorasExtras) {
        return salarioBruto - descontoINSS - descontoIRPF - descontoPlanoSaude + acrescimoHorasExtras;
    }
}