// class Name {
//     String name;

//     Name(String name) {
//         this.name = name;
//     }

//     void length() {
//         System.out.println("Length of string is " + name.length());
//     }

//     void isLetterPresent(String letter) {
//         if (name.contains(letter))
//             System.out.println("The string contains the letter " + letter);
//         else
//             System.out.println("The string contains the letter " + letter);
//     }

//     void printOccurences(char letter) {
//         System.out.print("'" + letter + "'" + " is present at positions: ");
//         for (int i = 0; i < name.length(); i++) {
//             if (name.charAt(i) == letter) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// public class Program4 {
//     public static void main(String[] args) {
//         Name n = new Name("Pranav");
//         n.length();
//         n.isLetterPresent("v");
//         n.printOccurences('a');
//     }
// }

public class Program4 {
    public static void main(String[] args) {
        String name = new String("Pranav");
        System.out.println(name);
        System.out.println(name.contains("v"));

    }
}