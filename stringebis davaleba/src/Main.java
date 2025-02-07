//#1
//public class Main {
//    public static void main(String[] args) {
//        String str = "baroxalxo67676araferia";
//        int digitCount = 0;
//
//        for (char c : str.toCharArray()) {
//            if (Character.isDigit(c)) {
//                digitCount++;
//            }
//        }
//
//        System.out.println("Number of digits: " + digitCount);
//    }
//}
//
//
//#2
//public class Main {
//    public static void main(String[] args) {
//        String str = "Hello! How are you? I am fine.";
//        String[] sentences = str.split("[.!?]+");
//
//        System.out.println("Number of sentences: " + sentences.length);
//    }
//}
//
//
//#3
//public class Main {
//    public static void main(String[] args) {
//        String str = "madam";
//        String reversedStr = new StringBuilder(str).reverse().toString();
//
//        if (str.equals(reversedStr)) {
//            System.out.println("The string is a palindrome.");
//        } else {
//            System.out.println("The string is not a palindrome.");
//        }
//    }
//}
//
//
//#4
//public class Main {
//    public static void main(String[] args) {
//        String s1 = "HelloWorld";
//        String s2 = "World";
//
//        if (s1.contains(s2)) {
//            System.out.println(s2 + " is a substring of " + s1);
//        } else {
//            System.out.println(s2 + " is not a substring of " + s1);
//        }
//    }
//}
//
//
//
//
//#5
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String str = scanner.nextLine();
//
//        char lastChar = str.charAt(str.length() - 1);
//        if ("aeiouAEIOU".indexOf(lastChar) != -1) {
//            System.out.println("The string ends with a vowel.");
//        } else {
//            System.out.println("The string ends with a consonant.");
//        }
//    }
//}
//
//
//
//#6
//public class Main {
//    public static void main(String[] args) {
//        String str = "aabbcc";
//        StringBuilder originalWord = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i++) {
//            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
//                originalWord.append(str.charAt(i));
//            }
//        }
//
//        System.out.println("Original word: " + originalWord.toString());
//    }
//}
//
//
//#7
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a word: ");
//        String word = scanner.nextLine();
//
//        if (word.length() > 10) {
//            char firstLetter = word.charAt(0);
//            char lastLetter = word.charAt(word.length() - 1);
//            int middleLength = word.length() - 2;
//            String abbreviation = firstLetter + Integer.toString(middleLength) + lastLetter;
//            System.out.println("Abbreviation: " + abbreviation);
//        } else {
//            System.out.println("The word is not huge.");
//        }
//    }
//}


