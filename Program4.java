import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int count = 0;
        int a[] = new int[10];
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = ip.next();
        System.out.println("Length of the name: " + name.length());
        System.out.println("Enter character to be searched");
        char key = ip.next().charAt(0);
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == key) {
                System.out.println(count + " " + key);
                a[++count] = i;
            }
        }
        if (count == 0)
            System.out.println("Character is not found");
        else {
            System.out.println("Frequency of inputted character is " + count);
            System.out.println("Locations in which the given character is present are ");
            for (int i = 0; i <= count; i++)
                System.out.println(a[i] + 1);
        }
    }
}