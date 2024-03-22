public class Printer {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int num : array) { // Iterate through each number in the array
            for (int i = 0; i < num; i++) { // Print stars based on the value of the number
                System.out.print("*");
            }
            System.out.println(); // Move to the next line for the next number
        }
    }
}
