package exercicio_2;
import java.util.Scanner;
public class Calculo {

    Scanner leia = new Scanner(System.in);
    EntradaSaida entradaSaida = new EntradaSaida();

    public double descontoINSS(){
        return 0.2 * entradaSaida.saida();
    }

    public double descontoIRPF(){
        return 0.1 * entradaSaida.salarioBruto;
    }

    public double descontoPlano(){
        return 0.05 * entradaSaida.salarioBruto;
    }

    public double acrescimoHoras(){
        System.out.println("Insira quantas horas extras você trabalhou:");
        double horasExtras = leia.nextDouble();
        double salarioHora = entradaSaida.salarioBruto / 160;
        return (salarioHora * 0.5) * horasExtras;
    }

    public double salarioLiquido(){
        return entradaSaida.salarioBruto;
    }
}
