import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class javaUtils {
    public static void main(String[] args) {

        // We define the ArrayList object using the Collection class reference
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();

        // Adding numbers in the list
        nums.add(13);
        nums.add(17);
        nums.add(19);
        nums.add(23);
        nums.add(29);

        System.out.println(nums); // prints ArrayList

        System.out.println(nums.get(2)); // value at index 2

        System.out.println(nums.indexOf(23)); // 3

        System.out.println(nums.size()); // size - length

        // printing all values in the array
        for (int i : nums) {
            System.out.println(i);
        }

        // We can not add duplicate values in a set - only unique values exist in a set
        // Set<Integer> se = new HashSet<Integer>();
        Set<Integer> se = new TreeSet<Integer>(); // sorts the elements in the set

        se.add(7);
        se.add(37);
        se.add(7);
        se.add(17);
        se.add(70);
        se.add(2);

        System.out.println(se);

        // Implementation of map - Dictionary in Python : Collection of key (set -
        // unique) and values

        Map<String, Integer> students = new Hashtable<>();
        students.put("Puran", 87);
        students.put("Sodhi", 91);
        students.put("Rashu", 97);
        students.put("Golu", 47);

        System.out.println(students);

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
