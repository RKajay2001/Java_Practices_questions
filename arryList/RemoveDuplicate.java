package arryList;

import java.util.ArrayList;

public class RemoveDuplicate {

    public static void main(String[] args) {
        // Getting input from the user
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(5);

        // Displaying the ArrayList before removing duplicates
        System.out.println("ArrayList before removing duplicates: " + arrayList);
        

        // Removing duplicates from the ArrayList
        removeDuplicates(arrayList);

        // Displaying the ArrayList after removing duplicates
        System.out.println("ArrayList after removing duplicates: " + arrayList);
    }

    // Function to remove duplicates from an ArrayList without using HashSet
    public static void removeDuplicates(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int currentElement = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).equals(currentElement)) {
                    // Remove duplicate element
                    list.remove(j);
                    j--; // Adjust index after removal
                }
            }
        }
    }
}

