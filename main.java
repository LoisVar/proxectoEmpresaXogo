import java.util.*;
import java.lang.Math;

public class main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calcularEntrada();
    }
    
    public static void calcularEntrada() {
        int prezo;
        int idade;
        
        System.out.println("Indica a idade do cliente,,");
        idade = input.nextInt();
        if (idade < 0) {
            System.out.println("Idade non válida");
        } else {
            if (idade < 4 && idade >= 0) {
                prezo = 0;
            } else {
                if (idade < 18) {
                    prezo = 5;
                } else {
                    prezo = 10;
                }
            }
            System.out.println("O prezo é " + prezo);
        }
    }
}
