package miPrincipal;
import java.util.Scanner;
public class AppNaturales{
    public static void menu(){
        System.out.println("*************************");
        System.out.println("   NUMEROS NATURALES");
        System.out.println("*************************");
        Scanner sc = new Scanner(System.in);
        System.out.print("Proporciona Número: ");
        int n = sc.nextInt();
        System.out.println("Versión iterativa");
        muestraNaturalesIte(n);
        System.out.println("Versión recursiva");
        muestraNaturalesRec(n);
        System.out.println();
    }

    public static void muestraNaturalesIte(int n){
        for(int i = 0; i <= n; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public static void muestraNaturalesRec(int n){
        //System.out.print(n+" "); //Se imprime en orden decendente
        if(n > 0)
            muestraNaturalesRec(n-1);
        System.out.print(n+" "); //Se imprime en orden ascendente
    }
}