// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
// A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

import java.util.ArrayList;
import java.util.List;

public class phonepad{
    public static void main(String[] args){
        List<String> list = letterCombinations("12");
        System.out.println(list);
    }
    public static List<String> letterCombinations(String digits) {
        return pad("",digits);
    }

    public static List<String> pad(String p , String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> l = new ArrayList<>();
        
        int digit = up.charAt(0) - '0'; //It will convert '2' into 2
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch = (char)('a' + i);
            l.addAll(pad(p+ch,up.substring(1)));
        }

        return l;
    }
}