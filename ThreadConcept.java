// extending thread class

class X extends Thread {
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        X x1 = new X();
        x1.start();
        for(int i=7; i<11; i++) {
            System.out.println(i);
        }
    }
}

// ............................................................

// implementing runneble interface

class X implements Runnable {
    public void run() {
        for(int i=0; i<3; i++)
            System.out.println(i);
    }
}

class Main {
    public static void main(String[] args) {
        X x1 = new X();
        // x1.run();

        Thread T = new Thread(x1);
        T.start();
        // for(int i=4; i<7 ; i++) {
        //     System.out.println(i);
        // }
    }
}
