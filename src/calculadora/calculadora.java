package calculadora;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a, b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextFloat();

        float somar = somar(a, b);
        float subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);


        System.out.println("somar: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("div: " + dividir);
        //System.out.println("somar a + b: " + somar);

    }

    public static float somar(float a, float b) {
        return  a + b;
    }
    public static float subtrair(float a, float b) {
        return a - b;
    }
    public static float multiplicar(float a, float b) {
        return a * b;
    }
    public static float dividir(float a, float b) {
        return a / b;
    }
}
