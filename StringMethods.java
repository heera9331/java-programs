 
/*
class StringPractice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Heera");
        // String str = new String(sb);
        // System.out.println(str);
        // String s = new String(sb);
        // String s = sb        //-----------------> StringBuilder can't convert to String
        // StringBuffer sbf = new StringBuffer(sb);
        // System.out.println(sbf);
    }
}
 */


// 1. str.length() -> return length of string

// 2. str.equals(str2) -> return if str1 and str2 contents is equals

// 3. str.concat(str2) -> concate string str1 with str2 

// 4. str.substring(start, end) -> slice string from start to end

// 5. str.charAt(index) -> return character at specified position

// 6. str.replace(oldChar, newChar) -> replace old character to new character

// 7. str.compareTo() or compareTo(str1, str2) -> The method compareTo() is used for comparing two strings lexicographically in Java.
// ...
// It returns the following values:
// if (string1 > string2) it returns a positive value.
// if both the strings are equal lexicographically i.e.(string1 == string2) it returns 0.
// if (string1 < string2) it returns a negative value.
/*
 *      String str = new String("Leera");
        System.out.println(str.compareTo("Heera"));
        System.out.println("Rahul".compareTo("Heera"));
 */

// 8. str.contains("ee") -> checks existance of speficied string value
//    if specified string value exist in str than return true otherwise false

// 9. codePointAt(index) -> return unicode/ascii value of specifiend index character.

// 10. str1.lastIndexOf(str) -> it check str is present at last index so return index
//                          otherwise return -1

// 11. indexOf(char) -> return index of char if present otherwise -1

// class Main {
//     public static void main(String[] args) {
//         String str = new String("Heera Singh");
//         // System.out.println(str.codePointAt(0));
//         // System.out.println(str.lastIndexOf("h"));
       
        
//     }
 
