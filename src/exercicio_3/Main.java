package exercicio_3;

public class Main {
    public static void main(String[] args) {
        double salario = EntradaSaida.receberSalario();
        double valorEmprestimo = EntradaSaida.receberValorEmprestimo();
        double valorTotal = Calculo.calcularValorTotalEmprestimo(valorEmprestimo);
        double valorParcela = Calculo.calcularValorParcela(valorTotal);

        if (Validacao.validarEmprestimo(salario, valorEmprestimo, valorParcela)) {
            EntradaSaida.mostrarDetalhesEmprestimo(valorEmprestimo, valorTotal, valorParcela);
        } else {
            System.out.println("Empréstimo não aprovado. O valor da parcela excede 15% do salário.");
        }
    }
}
