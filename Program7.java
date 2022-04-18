public class Program7 {
    public static void main(String[] args) {

        // Arithmetic Exception
        try {
            int a = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        // ArrayIndexOutOfBoundsException
        try {
            int arr[] = { 1, 2, 3, 4 };
            arr[5] = 23;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // NumberFormatException
        try {
            int num = Integer.parseInt("null");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        // StringIndexOutOfBoundsException
        try {
            String name = "ABC";
            System.out.println(name.charAt(name.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // NullPointerException
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
