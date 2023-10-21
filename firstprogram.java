//1) shuffle array

//import java.util.Arrays;
//import java.util.Random;
//
//public class ShuffleArray {
//    public static void main(String[] args) {
//        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
//
//        shuffleArray(originalArray);
//
//        System.out.println("Shuffled Array: " + Arrays.toString(originalArray));
//    }
//
//    public static void shuffleArray(int[] array) {
//        int n = array.length;
//        Random random = new Random();
//
//        for (int i = n - 1; i > 0; i--) {
//            int j = random.nextInt(i + 1);
//
//            // Swap array[i] and array[j]
//            int temp = array[i];
//            array[i] = array[j];
//            array[j] = temp;
//        }
//    }
//

//2)Roman letter
//
//import java.util.HashMap;
//
//public class RomanToInteger {
//    public static void main(String[] args) {
//        String romanNumeral = "IX"; // Replace with the Roman numeral you want to convert
//
//        int result = romanToInteger(romanNumeral);
//
//        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + result);
//    }
//
//    public static int romanToInteger(String s) {
//        HashMap<Character, Integer> romanValues = new HashMap<>();
//        romanValues.put('I', 1);
//        romanValues.put('V', 5);
//        romanValues.put('X', 10);
//        romanValues.put('L', 50);
//        romanValues.put('C', 100);
//        romanValues.put('D', 500);
//        romanValues.put('M', 1000);
//
//        int result = 0;
//        int prevValue = 0;
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int value = romanValues.get(s.charAt(i));
//
//            if (value < prevValue) {
//                result -= value;
//            } else {
//                result += value;
//            }
//
//            prevValue = value;
//        }
//
//        return result;
//    }
//}

//3)pangramor not
//
//public class PangramChecker {
//    public static void main(String[] args) {
//        String input = "The quick brown fox jumps over the lazy dog"; // Replace with the input string you want to check
//
//        boolean isPangram = isPangram(input);
//
//        if (isPangram) {
//            System.out.println("The input is a pangram.");
//        } else {
//            System.out.println("The input is not a pangram.");
//        }
//    }
//
//    public static boolean isPangram(String input) {
//        // Convert the input to lowercase for case insensitivity
//        input = input.toLowerCase();
//        
//        // Create an array to mark the presence of each letter from 'a' to 'z'
//        boolean[] isPresent = new boolean[26];
//
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//            if (Character.isLetter(c)) {
//                int index = c - 'a'; // Calculate the index for the current character
//                isPresent[index] = true;
//            }
//        }
//
//        // Check if all the letters from 'a' to 'z' are present
//        for (boolean letterPresent : isPresent) {
//            if (!letterPresent) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}



