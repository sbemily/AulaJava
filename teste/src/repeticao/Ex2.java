package repeticao;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String senha;

        do {
            System.out.println("Digite a senha: ");
            senha = leitor.nextLine();

            if (!senha.equals("123")) {
                System.out.println("Senha incorreta!");
            }
        } while (!senha.equals("123"));
    }
}
