public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (left < letters.length){
            return letters[left];
        }else{
            return letters[0];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char result = solution.nextGreatestLetter(letters, target);
        // System.out.println(result);  // Output: 'c'
    }
}
