import java.io.FileNotFoundException;

import javax.management.RuntimeErrorException;

public class Exception2in {
    public static void main(String[] args) throws FileNotFoundException{
       try{
        // Try to run code
       }
       catch(Exception e2){
        // 
       }
       finally{
        //Run whether there is any error or not
       }

    }
    void fall() throws Exception{
        throw new RuntimeErrorException(null);
    }
}
