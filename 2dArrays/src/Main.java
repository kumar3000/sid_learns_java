public class Main {
    public static void main(String[] args) {
        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};
        System.out.println(groceries[2][3]); // [row][column] - should output fish

        for (String[] category : groceries) {
            for (String food : category) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
