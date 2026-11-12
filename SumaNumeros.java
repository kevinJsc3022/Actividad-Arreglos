import java.util.Scanner;
public class SumaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];
        int suma = 0;
        for (int i=0; i<5; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = entrada.nextInt();
            suma = suma + numeros[i];
        }
        System.out.println("La suma total es: " + suma);
        entrada.close();
    }
}
