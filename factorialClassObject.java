
class Fact {
    int n;
    int f;

    public Fact() {
        f=1;
    }

    public Fact(int n) {
        this();
        this.n = n;
    }

    public long calFac() {
        while(n!=0)
            f*=n--;
        return f;
    }
}

class Main {
    public static void main(String[] args) {
        Fact f = new Fact(5);
        System.out.println(f.calFac());
    }
}
