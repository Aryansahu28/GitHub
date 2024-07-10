// You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
public class smallestchar {
    public static void main(String[] args) {
        
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int middle = start + (end - start)/2;
            if(target < letters[middle]){
                end = middle -1;
            } else{
                start = middle + 1;
            }
        }
        return letters[start % letters.length];
    }
}
