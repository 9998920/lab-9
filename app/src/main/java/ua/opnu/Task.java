package ua.opnu;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.HashMap;

public class Task {
    public static void main(String[] args) {
        Task task = new Task();

        // Завдання 1
        List<String> list1 = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        task.removeShorterStrings(list1);
        System.out.println("Завдання 1: " + list1);

        // Завдання 2
        List<String> list2 = new ArrayList<>(Arrays.asList("how", "are", "you?"));
        task.stutter(list2);
        System.out.println("Завдання 2: " + list2);

        // Завдання 3
        List<String> list3 = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        task.switchPairs(list3);
        System.out.println("Завдання 3: " + list3);

        // Завдання 4
        List<String> list4 = new ArrayList<>(Arrays.asList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to"));
        task.removeDuplicates(list4);
        System.out.println("Завдання 4: " + list4);

        // Завдання 5
        List<String> list5 = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        task.markLength4(list5);
        System.out.println("Завдання 5: " + list5);

        // Завдання 6
        Queue<Integer> q6 = new ArrayDeque<>(Arrays.asList(3, 8, 17, 9, 17, 8, 3));
        System.out.println("Завдання 6 (паліндром?): " + task.isPalindrome(q6));

        // Завдання 7
        Queue<Integer> q7 = new ArrayDeque<>(Arrays.asList(1, 2, -2, 4, -5, 8, -8, 12, -15, 23));
        task.reorder(q7);
        System.out.println("Завдання 7: " + q7);

        // Завдання 8
        Queue<Integer> q8 = new ArrayDeque<>(Arrays.asList(3, 5, 4, 17, 6, 83, 1, 84, 16, 37));
        task.rearrange(q8);
        System.out.println("Завдання 8: " + q8);

        // Завдання 9
        Set<String> set9 = new HashSet<>(Arrays.asList("one", "two", "three"));
        System.out.println("Завдання 9 (найдовший): " + task.maxLength(set9));

        // Завдання 10
        Set<String> set10 = new HashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        task.removeEvenLength(set10);
        System.out.println("Завдання 10: " + set10);

        // Завдання 11
        List<Integer> list11a = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> list11b = Arrays.asList(-5, 15, 2, -1, 7, 15, 36);
        System.out.println("Завдання 11 (спільні): " + task.numInCommon(list11a, list11b));

        // Завдання 12
        Map<String, String> map12 = new HashMap<>(Map.of("Marty", "Stepp", "Stuart", "Reges", "Jessica", "Miller", "Bruce", "Reges", "Hal", "Perkins"));
        System.out.println("Завдання 12 (унікальні?): " + task.isUnique(map12));

        // Завдання 13
        Map<String, Integer> map13a = new HashMap<>(Map.of("Janet", 87, "Logan", 62, "Whitaker", 46, "Alyssa", 100, "Stefanie", 80, "Jeff", 88, "Kim", 52, "Sylvia", 95));
        Map<String, Integer> map13b = new HashMap<>(Map.of("Logan", 62, "Kim", 52, "Whitaker", 52, "Jeff", 88, "Stefanie", 80, "Brian", 60, "Lisa", 83, "Sylvia", 87));
        System.out.println("Завдання 13 (перетин): " + task.intersect(map13a, map13b));

        // Завдання 14
        Map<Integer, String> map14 = new HashMap<>(Map.of(42, "Marty", 81, "Sue", 17, "Ed", 31, "Dave", 56, "Ed", 3, "Marty", 29, "Ed"));
        System.out.println("Завдання 14 (reverse): " + task.reverse(map14));

        // Завдання 15
        Map<String, Integer> map15 = new HashMap<>(Map.of("Alyssa", 22, "Char", 25, "Dan", 25, "Jeff", 20, "Kasey", 20, "Kim", 20, "Mogran", 25, "Ryan", 25, "Stef", 22));
        System.out.println("Завдання 15 (найрідше): " + task.rarest(map15));

        // Завдання 16
        List<Integer> list16 = Arrays.asList(9, 7, 9, -1, 2, 9, 7, 2, 15, 15);
        System.out.println("Завдання 16 (макс кількість): " + task.maxOccurrences(list16));
    }

    public void removeShorterStrings(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() <= list.get(i + 1).length()) {
                list.remove(i);
            } else {
                list.remove(i + 1);
            }
        }
    }

    public void stutter(List<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i + 1, list.get(i));
        }
    }

    public void switchPairs(List<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }

    public void removeDuplicates(List<String> list) {
        if (list == null || list.isEmpty()) return;
        for (int i = 1; i < list.size(); ) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    public void markLength4(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++; // Перестрибуємо через доданий рядок
            }
        }
    }

    public boolean isPalindrome(Queue<Integer> queue) {
        if (queue == null || queue.isEmpty()) return true;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = queue.size();
        boolean isPal = true;
        for (int i = 0; i < size; i++) {
            int num = queue.remove();
            stack.push(num);
            queue.add(num);
        }
        for (int i = 0; i < size; i++) {
            int num = queue.remove();
            if (num != stack.pop()) {
                isPal = false;
            }
            queue.add(num);
        }
        return isPal;
    }

    public void reorder(Queue<Integer> queue) {
        if (queue == null || queue.isEmpty()) return;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int num = queue.remove();
            if (num < 0) {
                stack.push(num);
            } else {
                queue.add(num);
            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        int remainingSize = queue.size() - stack.size();
        for (int i = 0; i < remainingSize; i++) {
            queue.add(queue.remove());
        }
    }

    public void rearrange(Queue<Integer> queue) {
        if (queue == null || queue.isEmpty()) return;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int size = queue.size();
        int evenCount = 0;
        for (int i = 0; i < size; i++) {
            int num = queue.remove();
            if (num % 2 == 0) {
                queue.add(num);
                evenCount++;
            } else {
                stack.push(num);
            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < evenCount; i++) {
            queue.add(queue.remove());
        }
        for (int i = 0; i < size - evenCount; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public int maxLength(Set<String> set) {
        if (set == null || set.isEmpty()) return 0;
        int max = 0;
        for (String s : set) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }

    public void removeEvenLength(Set<String> set) {
        if (set != null) {
            set.removeIf(s -> s.length() % 2 == 0);
        }
    }

    public int numInCommon(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) return 0;
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        return set1.size();
    }

    public boolean isUnique(Map<String, String> map) {
        if (map == null || map.isEmpty()) return true;
        Set<String> uniqueValues = new HashSet<>(map.values());
        return uniqueValues.size() == map.size();
    }

    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();
        if (map1 == null || map2 == null) return result;
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (map2.containsKey(key) && map2.get(key).equals(value)) {
                result.put(key, value);
            }
        }
        return result;
    }

    public Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> result = new HashMap<>();
        if (map == null) return result;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

    public int rarest(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) throw new IllegalArgumentException("Map is empty");
        Map<Integer, Integer> counts = new HashMap<>();
        for (Integer value : map.values()) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }
        int minCount = Integer.MAX_VALUE;
        int rarestValue = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int val = entry.getKey();
            int count = entry.getValue();
            if (count < minCount) {
                minCount = count;
                rarestValue = val;
            } else if (count == minCount && val < rarestValue) {
                rarestValue = val;
            }
        }
        return rarestValue;
    }

    public int maxOccurrences(List<Integer> list) {
        if (list == null || list.isEmpty()) return 0;
        Map<Integer, Integer> counts = new HashMap<>();
        int maxCount = 0;
        for (Integer num : list) {
            int currentCount = counts.getOrDefault(num, 0) + 1;
            counts.put(num, currentCount);
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        return maxCount;
    }
}