package arryList;

import java.util.ArrayList;

public class Duplicate {

    public static void main(String[] args) {
        // Sample ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(5);

        // Finding duplicate elements
        ArrayList<Integer> duplicates = findDuplicates(arrayList);

        // Displaying duplicate elements
        System.out.println("Duplicate elements in the ArrayList: " + duplicates);
    }

    // Function to find duplicate elements in an ArrayList without using HashMap
    public static ArrayList<Integer> findDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && !result.contains(list.get(i))) {
                    result.add(list.get(i));
                }
            }
        }

        return result;
    }
}

