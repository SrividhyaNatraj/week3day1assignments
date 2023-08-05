package week3.day1ass;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
        String test = "changeme";
        String result = changeOddIndexToUpperCase(test);
        System.out.println("Modified String: " + result);
    }

    public static String changeOddIndexToUpperCase(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            // Check if the index is odd using mod operator (%)
            if (i % 2 != 0) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
   // Convert char array back to a String
return new String(charArray);
}
}