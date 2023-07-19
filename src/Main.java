public class Main {

    public static void main(String[] args) {

        String nome = "Claudio";

        int lunghezzaNome = nome.length();

        if (lunghezzaNome % 2 != 0) {
            System.out.println("Il numero delle lettere del mio nome è dispari.");
        } else {
            System.out.println("Il numero delle lettere del mio nome è pari.");
        }
    }
}
