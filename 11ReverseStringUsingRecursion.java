// reverse string using recursion
class Main {
    static void reverseString(String str, int len) {
        if (len == 0) {
            System.out.print(str.charAt(len));
            return;
        }
        System.out.print(str.charAt(len));
        reverseString(str, len-1);
    }
    public static void main(String[] args){
        String str = "abcd";
        int n = str.length();
        reverseString(str, n-1);
    }
}
