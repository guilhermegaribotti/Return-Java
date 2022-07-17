public class TesteCarro {

    public static void main(String[] args) {

        Carro gol = new Carro();

        gol.marca = "Volkswagem";
        gol.modelo = "G3";
        gol.numPassageiros = 5;
        gol.capCombustivel = 40;
        gol.consumoCombustivel = 10;

        gol.exibirAutonomia();

        System.out.println("Aqui o método autonomia foi chamado: " + gol.obterAutonomia());


    }
}
