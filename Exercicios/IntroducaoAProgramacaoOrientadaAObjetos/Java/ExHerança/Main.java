package Exercicios.IntroducaoAProgramacaoOrientadaAObjetos.Java.ExHerança;

import java.text.DecimalFormat;

// Classe Main que contém o método main para execução do programa
public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Maicon", 10000.0);
        Funcionario desenvolvedor = new Desenvolvedor("Douglas", 8000.0, Desenvolvedor.NivelExperiencia.AVANCADO);
        Funcionario vendedor = new Vendedor("Fábio", 3500.00, 5000.0);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        System.out.println("Pagamento mensal do Gerente: R$" + decimalFormat.format(gerente.calcularPagamentoMensal()));
        System.out.println("Pagamento mensal do Desenvolvedor: R$" + decimalFormat.format(desenvolvedor.calcularPagamentoMensal()));
        System.out.println("Pagamento mensal do Vendedor: R$" + decimalFormat.format(vendedor.calcularPagamentoMensal()));
    }
}
