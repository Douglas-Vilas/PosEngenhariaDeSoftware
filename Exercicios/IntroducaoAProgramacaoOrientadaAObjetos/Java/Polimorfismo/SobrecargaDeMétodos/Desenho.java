package Exercicios.IntroducaoAProgramacaoOrientadaAObjetos.Java.Polimorfismo.SobrecargaDeMétodos;

public class Desenho {
    // Método sem parâmetro
    public void mostrar() {
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            if (i != 9) {
                System.out.print("*" + ", ");
            } else {
                System.out.println("*" + ";");
            }
        }        
        System.out.println(" ");
    }

    // Método com um parâmetro
    public void mostrar(String simb) {
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            if (i != 9) {
                System.out.print(simb + ", ");
            } else {
                System.out.println(simb + ";");
            }            
        }        
        System.out.println(" ");
    }

    // Método com dois parâmetro
    public void mostrar(String simb, int n) {
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(simb + ", ");
            } else {
                System.out.println(simb + ".");
            }
        }
        System.out.println(" ");
    }
}
