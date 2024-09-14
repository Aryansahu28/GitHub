public class mazesimple {
    public static void main(String[] args){
        mazesimple maze = new mazesimple();
        System.out.print(maze.count(3,3));
    }

    public int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1,c);
        // LEFT COUNT  
        int right = count(r,c-1);
        return left+right;
    }
}
