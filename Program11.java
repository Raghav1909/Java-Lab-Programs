import java.io.*;

public class Program11 {
    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("test.txt");
            myWriter.write("Java is a fun language!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileReader myReader = new FileReader("test.txt");
            int i;
            System.out.println("\nContents of the file:");
            while ((i = myReader.read()) != -1)
                System.out.print((char) i);
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
