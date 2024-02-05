package arryList;

import java.util.ArrayList;
import java.util.Collections;

public class Reversal {

    public static void main(String[] args) {
        // Sample ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Reversing the ArrayList
        reverseArrayList(arrayList);

        // Displaying the reversed ArrayList
        System.out.println("Reversed ArrayList: " + arrayList);
    }

    // Function to reverse an ArrayList
    public static void reverseArrayList(ArrayList<Integer> list) {
        Collections.reverse(list);
    }
}

