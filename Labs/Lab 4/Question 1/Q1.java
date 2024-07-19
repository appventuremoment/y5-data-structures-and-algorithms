public class Q1 {
    public static long forwardcombi(int n,int k){
        if (n == k) return 1;
        else{
            return n * forwardcombi(n - 1, k) / (n - k);
        }
    }

    public static void main(String[] args) {
        System.out.println(forwardcombi(35,23));
    }
}