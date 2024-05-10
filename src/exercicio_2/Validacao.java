package exercicio_2;

public class Validacao {

    EntradaSaida entradaSaida = new EntradaSaida();

    public boolean validar(){
        return entradaSaida.salarioBruto <= 3000 && entradaSaida.salarioBruto >= 500;
    }
}
