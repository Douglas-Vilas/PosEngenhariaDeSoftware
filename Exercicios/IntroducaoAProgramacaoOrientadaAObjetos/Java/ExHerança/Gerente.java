package Exercicios.IntroducaoAProgramacaoOrientadaAObjetos.Java.ExHerança;

// Classe Gerente que estende Funcionários
public class Gerente extends Funcionario {
    private static final double BONUS = 0.15; // Bônus fixo para o gerente
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override 
    public double calcularSalarioAnual() {
        return (getSalario() * 12) + (getSalario() * BONUS * 12); // Calcula o salário anual com o bônus
    }

    @Override
    public double calcularPagamentoMensal() {
        return calcularSalarioAnual() / 12; // Divide o salário anual por 12 para obter o pagamento mensal 
    }
}

