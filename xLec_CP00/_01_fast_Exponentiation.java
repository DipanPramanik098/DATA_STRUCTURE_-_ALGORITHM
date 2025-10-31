public class _01_fast_Exponentiation{
    public static int pow(int a, int n){
        if(n==0) return 1;

        int subProb = pow(a,n/2);
        if((n&1) == 1){
            //odd
            return a * subProb * subProb;
        }
        // even
        return  subProb * subProb;
    }
    public static void main(String[] args) {
        System.out.println(pow(5, 11));
        System.out.println(pow(2, 11));
    }
}