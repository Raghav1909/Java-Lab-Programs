import java.util.Scanner;

class Sort<T> {
    int n;
    T[] arr = new T[n];

    void read() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        n = ip.nextInt();
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++)
            arr[i] = ip.nextInt();
    }
}

public class Program10 {
    public static void main(String[] args) {

    }
}
