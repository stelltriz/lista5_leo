package exercicio_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        EntradaSaida entradaSaida = new EntradaSaida(0);
        Validacao validacao = new Validacao();
        Calculo calculo = new Calculo();

        System.out.println("I");
        entradaSaida.entrada();
        System.out.println(entradaSaida.saida());
        System.out.println(calculo.salarioLiquido());

    }
}