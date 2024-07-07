public class linear{
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'r';
        System.out.println(linearSearch(name,target));

    }
    static boolean linearSearch(String n,char target){
        // for(int i =0;i<n.length();i++){
        //     if(target == n.charAt(i))
        //     return true;
        // }
        // return false;
        for(char ch: n.toCharArray()){
            if(target == ch){
                return true;
            }
        }
        return false;
    }
}

