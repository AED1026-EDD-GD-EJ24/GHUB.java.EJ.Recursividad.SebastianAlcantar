package miPrincipal;

import java.util.Scanner;

public class AppSumaDigitos {
     public static void menu(){
        System.out.println("*************************");
        System.out.println("   NUMEROS NATURALES");
        System.out.println("*************************");
        Scanner sc = new Scanner(System.in);
        System.out.print("Proporciona Número: ");
        int n = sc.nextInt();
        System.out.println("Versión iterativa");
        System.out.println("Suma digitos: "+sumaDigitosIte(n));
        System.out.println("Versión recursiva");
        System.out.println("Suma digitos: "+sumaDigitosRec(n));

        System.out.println();
    }
    public static int sumaDigitosIte(int n){
        int suma = 0;
        while(n > 0){
            suma = suma + n%10;
            n  = n/10;
        }
        return suma;
    }
    public static int sumaDigitosRec(int n){
        if(n <= 0)
            return n;
        else
            return sumaDigitosRec(n/10)+n%10;
    }
}
