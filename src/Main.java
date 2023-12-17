public class Main {
    public static void main(String[] args) {
        double[] doubleArray1 = {3.14, -0.5, 2.0, 7.8, -2.5};
        double[] doubleArray2 = {1.1, 5.6, -4.3, 0.0, 9.2};

        System.out.println("First task: ");
        bubbleSort(doubleArray1);
        printArray(doubleArray1);
        System.out.println("Second task: ");
        selectionSort(doubleArray2);
        printArray(doubleArray2);
    }

    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        double temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void selectionSort(double[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            double smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void printArray(double[] arr) {
        System.out.print("Array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(); // Print a new line after printing the array elements
    }
}