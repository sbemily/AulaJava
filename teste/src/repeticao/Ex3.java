package repeticao;

public class Ex3 {
    public static void main(String[] args) throws InterruptedException {

        String [] listaCarros = {"Brasilia", "Fusca", "Gol", "Variant"};

        for (String cadaCarro : listaCarros) {
            System.out.println(cadaCarro);
            Thread.sleep(1000);
        }
    }
}
