package Exercicios.IntroducaoAProgramacaoOrientadaAObjetos.Java;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Carro usando o construtor padrão
        Carro veiculo = new Carro();

        // Definindo os atributos do carro, usando os setters
        veiculo.setMarca("Jeep");
        veiculo.setModelo("Compass");
        veiculo.setAno(2023);

        // Imprimindo os atributos do carro usando os getters
        System.out.println("Veículo");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Velocidade: " + veiculo.getVelocidade());

        // Acelerando o carro em 100 km/h
        veiculo.acelerar(100);

        // Imprimir a nova velocidade do carro 
        System.out.println("Velocidade após acelerar: " + veiculo.getVelocidade());

        // Freando o carro em 20 km/h
        veiculo.frear(20);

        // Imprimindo a nova velocidade do carro 
        System.out.println("Velocidade após frear: " + veiculo.getVelocidade());

        // Criando um segundo objeto carro usando o construtor sobrecarregado
        Carro veiculo02 = new Carro("Fiat", "Fastback", 2023, 120);

        // Imprimindo os atributos do segundo carro
        System.out.println("\nVeiculo 02");
        System.out.println("Marca: " + veiculo02.getMarca());
        System.out.println("Modelo: " + veiculo02.getModelo());
        System.out.println("Ano: " + veiculo02.getAno());
        System.out.println("Velocidade: " + veiculo02.getVelocidade());  
    }
}
