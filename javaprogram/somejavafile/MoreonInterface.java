package somejavafile;
import java.util.Random;
interface SomeVarible{
    int No = 0;
    int Yes = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

class Question implements SomeVarible{
    Random rand = new Random();
    int ask() {
        int prob = (int)(100*(rand.nextDouble()));
        if (prob<30){
            return No;
        }
        else if(prob<60){
            return Yes;
        }
        else if(prob<75){
            return MAYBE;
        }
        else if(prob<80){
            return SOON;
        }
        else{
            return NEVER;
        }
    }
}

class Askme implements SomeVarible{
    void answer(int result){
        switch (result) {
            case Yes:
                System.out.println("YES");
                break;
            case No:
                System.out.println("NO");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
        }
    }
}



public class MoreonInterface {
    public static void main(String args[]){
        Question q = new Question();
        Askme a = new Askme();

        a.answer(q.ask());
        a.answer(q.ask());
        a.answer(q.ask());
        a.answer(q.ask());
        a.answer(q.ask());
        a.answer(q.ask());
        a.answer(q.ask());
        
        

        
    }

    
}
