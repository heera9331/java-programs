// any case to title case
// heera -> Heera
// abhisek -> Abhisek

class Main {
    public static void main(String[] args) {
        String name = new String("heera");
        char[] ch = name.toCharArray();
        char oldChar = ch[0];
        char newChar = (char)(ch[0]-32);
        System.out.println(name.replace(oldChar, newChar));
    }
}
