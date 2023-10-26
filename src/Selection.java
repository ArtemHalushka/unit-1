public class Selection {

    //Function for sorting using selection method
    public static void sort(int[] array) {

        // First loop for iterating through array
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = i;

            // Second loop for finding minimal number in array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[currentMin]) {
                    currentMin = j;
                }
            }

            // Swap Current iterable element with minimal number
            int temp = array[currentMin];
            array[currentMin] = array[i];
            array[i] = temp;
        }
    }

    // Main function
    public static void main(String[] args) {
        int array[] = {99, 231, 53, 1, 4};
        //Function call
        sort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}