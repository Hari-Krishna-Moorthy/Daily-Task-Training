package Day_6;

//URL : https://leetcode.com/problems/count-primes/

public class CountPrimes {
    public static int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean prime[] = new boolean[n+1];
        prime[2] = true;
        for(int i = 3; i < n; i+=2) {
            prime[i] = true;
        }
        for (int i = 3; i*i<=n; i++){
            if (prime[i]){
                for (int j = i+i; j<=n; j += i ){
                    prime[j] = false;
                }
            }
        }
        int count = 1;
        for (int i = 3; i < n; i+=2){
            count += prime[i] ? 1:0;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
        System.out.println(countPrimes(0));
        System.out.println(countPrimes(5000000));
    }
}
