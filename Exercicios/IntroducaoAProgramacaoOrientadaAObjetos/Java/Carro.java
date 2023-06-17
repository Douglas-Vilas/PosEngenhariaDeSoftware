package Exercicios.IntroducaoAProgramacaoOrientadaAObjetos.Java;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    // Construtor Padrão: Inicializa todos os atributos com valores padrão
    public Carro() {
        marca = "Indefinida";
        modelo = "Indefinido";
        ano = 0;
        velocidade = 0.0;
    }

    // Construtor Sobrecarregado: Permite definir a marca, modelo, ano e velocidade
    public Carro(String marca, String modelo, int ano, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    // Métodos Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelicidade(double velicidade) {
        this.velocidade = velicidade;
    }

    // Método de aceleração e frenegem
    public void acelerar(double aceleracao) {
        velocidade += aceleracao;
    }

    public void frear(double desaceleracao) {
        velocidade -= desaceleracao;
    }
}
