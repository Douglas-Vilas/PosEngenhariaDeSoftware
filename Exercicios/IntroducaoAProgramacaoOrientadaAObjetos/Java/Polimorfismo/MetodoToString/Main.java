package Exercicios.IntroducaoAProgramacaoOrientadaAObjetos.Java.Polimorfismo.MetodoToString;

public class Main {
    public static void main(String[] args) {
        String primeira = "Java";
        String segunda = "Csharp";
        String terceira = new String("Python");

        System.out.println(primeira.toUpperCase());
        System.out.println(segunda.length());
        System.out.println(terceira);

        // Comparar a primeira com a segunda String
        boolean result = primeira.equals(segunda);
        System.out.println("Primeira é igual a Segunda? " + result);

        // Comparar a Segunda com a Terceira String
        result = segunda.equals(terceira);
        System.out.println("Segunda é igual a Terceira? " + result);
    }
}
