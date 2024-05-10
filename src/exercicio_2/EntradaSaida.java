package exercicio_2;
import java.util.Scanner;

public class EntradaSaida {

    Scanner leia = new Scanner(System.in);
    double salarioBruto;

    public EntradaSaida(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void entrada(){
        System.out.println("Insira o valor do salário bruto:");
        salarioBruto = leia.nextDouble();
    }

    public double saida(){
        return salarioBruto;
    }

}
