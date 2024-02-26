package miPrincipal;

public class AppFactorial {
    public static void menu(){
        System.out.println("Version iterativa");
        int n = 5;
        System.out.println("Factorial de "+n+" != "+factorial_ite(n));
    }
        public static long factorial_ite(int n){
            long fac = 1;
            for(int i = n; i > 0; i--){
                fac = fac * n;
            }
            return fac;
        }
        public static long factorial_rec(int n){
            if(n == 0)
                return 1;
            else
                return factorial_ite(n-1) * n;
        }
    }

