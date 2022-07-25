
class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        int n =ch.length;
        int m=0;
        char[] vowels = new char[n];
        for(int i=0; i<n;i++) {
            if  (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U'){
                vowels[m++] = ch[i];
            }
        }
        System.out.println(new String(vowels));
       
    }
}
