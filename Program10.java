public class Program10 {
    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;
        for (int i = 0; i < list.length - 1; i++) {
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = new Integer[] { 4, 9, 5 };
        Double[] doubleArray = new Double[] { 2.3, 5.6, 1.9 };
        Character[] charArray = new Character[] { 't', 'o', 'e' };
        String[] stringArray = new String[] { "hello", "greeshma", "mandya" };
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);
        System.out.println("sorted int array is :");
        printList(intArray);
        System.out.println("sorted double array is :");
        printList(doubleArray);
        System.out.println("sorted char array is :");
        printList(charArray);
        System.out.println("sorted string array is :");
        printList(stringArray);
    }
}