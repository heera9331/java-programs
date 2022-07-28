
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sirname[] = {"Singh", "Sahu", "Sen", "Ahirwar", "Lodhi", "Patel"};
        String names = new String("alokheerarahulpushpa");
        System.out.println("Enter name: ");
        String userInput = sc.next();
        if (names.contains(userInput.toLowerCase())) {
            String ns = userInput.toLowerCase();
            if (ns.equals("heera") || ns.equals("alok")) {
                System.out.println(sirname[0]);
            } else if (ns.equals("deepak") || ns.equals("deepesh") || ns.equals("shakshee") || ns.equals("mayank")) {
                System.out.println(sirname[1]);
            } else if (ns.equals("rahul") || ns.equals("neelesh")){
                System.out.println(sirname[2]);
            } else if (ns.equals("pushpa") || ns.equals("amisha") || ns.equals("kelash"))  {
                System.out.println(sirname[3]);
            } else {
                System.out.println("Not exists");
            }
        } else {
            System.out.println("Not exists");
        }
    }
}
