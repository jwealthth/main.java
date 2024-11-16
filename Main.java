class PalindromeCheck {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test the isPalindrome method
        String[] strings = {"radar", "hello", "level", "world", "madam"};
        for (String str : strings) {
            System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome(str));
        }
    }
}

