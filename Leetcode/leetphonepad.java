import java.util.ArrayList;
import java.util.List;

public class leetphonepad {
    public static void main(String[] args) {
        List<String> list = letterCombinations("");
        System.out.println(list);

    }

    public static List<String> letterCombinations(String digits) {
        return leetpad("", digits);
    }

    public static List<String> leetpad(String p, String up) {
        if (up.contains("1") || up.contains("0") || up.contains("*") || up.contains("#")) {
            List<String> empty = new ArrayList<>();
            return empty;
        }

        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int start;
        int end;
        int digit = up.charAt(0) - '0';
        List<String> l = new ArrayList<>();
        if (digit == 7) {
            start = 15;
            end = 19;
        }

        else if (digit == 8) {
            start = 19;
            end = 22;
        } else if (digit == 9) {
            start = 22;
            end = 26;
        } else {
            start = (digit - 2) * 3;
            end = (digit - 1) * 3;
        }

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            l.addAll(leetpad(p + ch, up.substring(1)));
        }

        return l;

    }
}
