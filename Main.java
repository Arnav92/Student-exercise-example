public class Main {
    public static void main(String[] args) {
        // Example array to sort
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // TODO: Implement linear sort here
        linearSort(numbers);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Placeholder for the linear sort method
    public static void linearSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Swap array[i] and array[j]
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}