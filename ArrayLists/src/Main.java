import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    // ArrayList = A resizeable array that stores objects (autoboxing)
    //             Arrays are fixes in size, but ArrayLists can change
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("pineapple");
        System.out.println(fruits);

        Collections.sort(fruits);
        System.out.println(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // exercise
        int nFood;
        ArrayList<String> food = new ArrayList<>();

        System.out.print("# of food: ");
        nFood = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nFood; i++) {
            System.out.print("Food: ");
            food.add(sc.nextLine());
        }

        System.out.println(food);

        sc.close();
    }
}
