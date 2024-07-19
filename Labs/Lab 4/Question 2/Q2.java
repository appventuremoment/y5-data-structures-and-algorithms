public class Q2 {
    public static double tailcombihelper(int n,int k, double accumulator){
        //add your code for tail recursion here
        if (n == k) return Math.round(accumulator);
        else{
            return tailcombihelper(n - 1, k, accumulator * n / (n - k));
        }
    }

    public static double tailcombi(int n,int k){
        return tailcombihelper(n,k,1);
    }

    public static void main(String[] args) {
        System.out.println(tailcombi(35,23)); //834451800
    }
}