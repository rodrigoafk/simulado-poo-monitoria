public class Main {

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(5.0, 5.0);

        if (retangulo1.isQuadrado()) System.out.println("É um retângulo quadrado!\n");
        else System.out.println("Não é um retângulo quadrado!\n");

        System.out.println("Área do retângulo: " + retangulo1.calcularArea());

    }
}
