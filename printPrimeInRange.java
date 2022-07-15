class printPrimeNumInRange {
    static boolean isPrime(int n) {
        if (n == 1){
            return true;
        }
        for(int i=2; i<=n/2; i++) {
            if((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    static void solve(int n1, int n2) {
        for(int i=n1; i<=n2; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        solve(2, 20);
    }

}
