package Exercicios.IntroducaoAProgramacaoOrientadaAObjetos.Java.ExHerança;

// Classe Desenvolvedor que estende Funcionário
public class Desenvolvedor extends Funcionario {
    // Enum para representar os níveis de experiência do Desenvolvedor
    public enum NivelExperiencia {
        INICIANTE(0.8), // Multiplicador para o nível iniciante
        INTERMEDIARIO(1.0), // Multiplicador para o nível intermediário
        AVANCADO(1.2); // Multiplicador para o nível avançado

        private double multiplicador; // Multiplicador associado ao nível de experiência

        NivelExperiencia(double multiplicador) {
            this.multiplicador = multiplicador;
        }

        public double getMultiplicador() {
            return multiplicador;
        }
    }

    private NivelExperiencia nivel; // Nível de experiência do Desenvolvedor

    public Desenvolvedor(String nome, double salario, NivelExperiencia nivel) {
        super (nome, salario);
        this.nivel = nivel;
    }

    @Override
    public double calcularSalarioAnual() {
        return getSalario() * (12 * nivel.getMultiplicador()); // Calcula o salário anual, multiplicando pelo multiplicador do nível de experiência
    }

    @Override
    public double calcularPagamentoMensal() {
        return calcularSalarioAnual() / 12; // Divide o salário anual por 12, para obter o pagamento mensal
    }    
}
