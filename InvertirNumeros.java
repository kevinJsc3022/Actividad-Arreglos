import java.util.Scanner;
public class InvertirNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[6];
        for (int i=0; i<6; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Orden Invertido:");
        for (int i=5; i>=0; i--) {
            System.out.println(numeros[i]);
        }
        entrada.close();
    }
}
