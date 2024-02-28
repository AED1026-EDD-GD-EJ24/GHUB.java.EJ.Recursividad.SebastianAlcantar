package miPrincipal;

public class AppMCD {
    public static void menu(){
        System.out.println(mcd(6,124));
        System.out.println(mcd(9,81));
    }    
    public static int mcd(int m, int n){
        if(n <= m && m % n == 0)
            return n;
        else if(m < n)
            return mcd(n,m);
        else
            return mcd(n, m%n);
    }
}
