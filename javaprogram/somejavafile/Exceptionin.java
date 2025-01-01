package somejavafile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptionin {

 public static void main(String[] args) //throws FileNotFoundException   
{

try{
    File file = new File("E:\rwgsf\sgg");
    FileReader fr = new FileReader(file);
}
catch(FileNotFoundException e){
    System.out.println(e);
    System.out.println("Enter a valid file ");
}
}
}