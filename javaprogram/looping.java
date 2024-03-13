public class looping {
    public static void main(String[] args){
        String ar = "abscaasvdfa";
        char str ='a';
        int j=-1;
        int k = -1;
        for(int i = 0 ;i<ar.length();i++){
           char str1 = ar.charAt(i);
            if (str1==str){
                if(j==-1){
                    j=i;
                }
                else{
                    k=i;
                }
            }

        }
        System.out.println(j);
        System.out.println(k);
    }   
}
