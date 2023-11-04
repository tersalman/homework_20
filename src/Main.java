import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

//        task1
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num );
            }
        }


//        task2
        System.out.println("---------------------------");
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 5, 4, 4, 5, 5, 6, 7));
        nums1.sort(Comparator.naturalOrder());
        Set<Integer> nums2 =new HashSet<>(nums1);

        for (Integer i : nums2) {
            if (i % 2 == 0) {
                System.out.println(i );
            }
        }


//        task3
        System.out.println("---------------------------");
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> words1 = new HashSet<>(words);
        System.out.println(words1);

//      task 4
        System.out.println("---------------------------");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String string : strings) {

            if (wordsMap.containsKey(string)) {
                Integer currentRepeats = wordsMap.get(string);
                wordsMap.put(string, currentRepeats + 1);
            } else {
                wordsMap.put(string, 1);
            }
        }
    }
}
