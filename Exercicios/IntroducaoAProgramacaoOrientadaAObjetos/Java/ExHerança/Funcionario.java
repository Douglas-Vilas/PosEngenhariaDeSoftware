package Exercicios.IntroducaoAProgramacaoOrientadaAObjetos.Java.ExHerança;

// Classe abstrata Funcionário implementando a interface Pagamento
public abstract class Funcionario implements Pagamento {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    // Método abstrato para calcular o salário anual(deve ser implementado pelas subclasses)
    public abstract double calcularSalarioAnual();

    @Override
    public double calcularPagamentoMensal() {
        return salario; // Retorna o salário mensal padrão
    }
}
