package Exercicios.IntroducaoAProgramacaoOrientadaAObjetos.Java.Polimorfismo.SobrecargaDeMétodos;

public class Main {
    public static void main(String[] args) {
        Desenho d1 = new Desenho();  

        d1.mostrar();
        d1.mostrar("#");
        d1.mostrar("$", 3);
    }
}
