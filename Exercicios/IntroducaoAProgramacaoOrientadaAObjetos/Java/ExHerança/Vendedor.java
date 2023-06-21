package Exercicios.IntroducaoAProgramacaoOrientadaAObjetos.Java.ExHerança;

// Classe Vendedor que estende Funcionário
public class Vendedor extends Funcionario {
    private double vendas; // Valor total de vendas do Vendedor
    private static final double COMISSAO = 0.05; // Taxa de comissão fixa para o vendedor 
    
    public Vendedor(String nome, double salario, double vendas) {
        super(nome, salario);
        this.vendas = vendas;
    }

    @Override
    public double calcularSalarioAnual() {
        return (getSalario() + vendas) * (COMISSAO * 12) * 12; // Calcula o salário anual, multiplicando o valor das vendas, pela taxa de comissão e pelo número de meses
    }

    @Override
    public double calcularPagamentoMensal() {
        return calcularSalarioAnual() / 12; // Divide o salário anual por 12, para obter o pagamento mensal
    }    
}
