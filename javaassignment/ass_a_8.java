public class ass_a_8 {
   public static void main(String args[]){
    int n = 12345;
    String a = Integer.toString(n);
    StringBuilder sbf = new StringBuilder("Reverse of String "+n+" is :");
    System.out.println(a.getClass().getTypeName());
    char t[] = a.toCharArray();
    char b[] = {0,0,0,0,0};
    int j=t.length-1;
    for(int i=0;i<t.length;i++){
        b[j] =t[i];
        j--;
    }
    for(int k=0;k<t.length;k++)
            System.out.println(b[k]);
    
    sbf.append(b);
    System.out.println(sbf);
   
   } 
}
