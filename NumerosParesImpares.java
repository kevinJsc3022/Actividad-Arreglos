import java.util.Scanner;
public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        int pares = 0;
        int impares = 0;
        for  (int i=0; i<10; i++){
            System.out.print("Ingrese un numero: ");
                numeros[i] = entrada.nextInt();
                if (numeros[i] % 2 == 0) {
                    pares++;
                } else{
                    impares++;
                }
            }
            System.out.println("Cantidad de números pares:" + pares);
            System.out.println("Cantidad de números impares:" + impares);
            entrada.close();
        }
    }
