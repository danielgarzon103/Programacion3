public class NumeroPerfecto {
    public static void main(String[] args) {
        System.out.println(esNumeroPerfecto(138));

    }

    public static boolean esNumeroPerfecto(int n) {
        System.out.println(n+" ");
        double suma=0;
        double n2=n/2;
        if ((n / 2) < 0.5) {
        suma+=n;
        }
        if (suma>n){
            return false;
        }
        if (suma==n){
            return true;
        }
        else {
            return esNumeroPerfecto(n/2);
        }

    }
}