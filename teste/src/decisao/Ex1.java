package decisao;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu salário: "); //console.log

        double salario = Double.parseDouble(leitor.nextLine());

        if (salario < 1000){
            double salarioReajustado = salario * 1.1;
            System.out.println(salarioReajustado);
        }else{
            System.out.println("Salário sem reajuste");
        }
    }
}
