import java.util.Scanner;

class Matrix {
    int arr[][], m, n;

    void read() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size of matrix (Input the value of m and n):");
        m = ip.nextInt();
        n = ip.nextInt();
        arr = new int[m][n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = ip.nextInt();
        }
    }

    Matrix addition(Matrix a, Matrix b) {
        Matrix result = new Matrix();
        result.arr = new int[a.m][b.n];
        if (a.m == b.m && a.n == b.n) {
            for (int i = 0; i < a.m; i++) {
                for (int j = 0; j < a.n; j++)
                    result.arr[i][j] = a.arr[i][j] + b.arr[i][j];
            }
            return result;
        } else {
            System.out.println("Addition is not possible");
            return result;
        }
    }

    Matrix multiplication(Matrix a, Matrix b) {
        Matrix result = new Matrix();
        result.arr = new int[a.m][b.n];
        if (a.n == b.m) {
            for (int i = 0; i < a.m; i++) {
                for (int j = 0; j < b.n; j++) {
                    for (int k = 0; k < b.m; k++)
                        result.arr[i][j] += a.arr[i][k] * b.arr[k][j];
                }
            }
        }
        return result;
    }

    void display() {
        System.out.println("The matrix is:");
        for (int[] eleArr : arr) {
            for (int ele : eleArr)
                System.out.print(ele + " ");
            System.out.println();
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Matrix mat1 = new Matrix();
        Matrix mat2 = new Matrix();
        Matrix res = new Matrix();
        Matrix res2 = new Matrix();

        mat1.read();
        mat1.display();
        mat2.read();
        mat2.display();
        res = res.addition(mat1, mat2);
        res.display();
        res2 = res2.multiplication(mat1, mat2);
        res2.display();
    }
}