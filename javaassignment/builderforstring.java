public class builderforstring {

    public static void main(String[] args) {
        // Without using StringBuilder
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);

        // With using StringBuilder
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            sb.append(ch);
        }
        System.out.println(sb);
    }
}