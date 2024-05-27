package exercicio_2;

public class Main {
    public static void main(String[] args) {
        double salarioBruto = EntradaSaida.receberSalario();
        double horasExtras = EntradaSaida.receberHorasExtras();
        double descontoINSS = Calculo.calcularINSS(salarioBruto);
        double descontoIRPF = Calculo.calcularIRPF(salarioBruto);
        double descontoPlanoSaude = Calculo.calcularPlanoSaude(salarioBruto);
        double acrescimoHorasExtras = Calculo.calcularHorasExtras(salarioBruto, horasExtras);
        double salarioLiquido = Calculo.calcularSalarioLiquido(salarioBruto, descontoINSS, descontoIRPF, descontoPlanoSaude, acrescimoHorasExtras);
        EntradaSaida.mostrarFolhaPagamento(salarioBruto, descontoINSS, descontoIRPF, descontoPlanoSaude, acrescimoHorasExtras, salarioLiquido);
    }
}