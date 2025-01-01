package somejavafile;
//Wrapper class uses primitive variable to initialize content int -> Integer, char -> Character, byte -> Byte, long -> Long
public class parseINt {
    public static void main(String[] args){
        int num = 13;
        // Integer num1 = new Integer(12);
        Integer num1 = num; //auto-boxing

        int num2 = num1; //auto-unboxing
        System.out.println(num2);
        System.out.println(num1);

        String str = "12";
        int nr = Integer.parseInt(str);
        System.out.println(nr*12);
    }
}
