package practice;

import java.util.*;

public class CoolNumbers {
    public static char getLetter() {
        char[] letters = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
        return letters[(int) (Math.random() * 12)];
    }

    public static String getDigits() {
        int digit = (int) (Math.random() * 10);
        return "" + digit + digit + digit;
    }

    public static String getRegion() {
        String region = String.valueOf((int) (Math.random() * 198 + 1));
        if (region.length() == 1) {
            return "0" + region;
        }
        return region;
    }

    public static List<String> generateCoolNumbers() {
        ArrayList <String> coolNumbers = new ArrayList<>();
        while(coolNumbers.size() < 2000004) {
            coolNumbers.add(getLetter() + getDigits() + getLetter() + getLetter() + getRegion());
        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long time = System.currentTimeMillis();
        for(String i : list){
            if(i.equals(number)) {
                System.out.println(System.currentTimeMillis() - time);
                return true;
            }
        }
        System.out.println(System.currentTimeMillis() - time);
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        long time = System.currentTimeMillis();
        Collections.sort(sortedList);
        System.out.println(System.currentTimeMillis() - time);
        return Collections.binarySearch(sortedList , number) >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}
