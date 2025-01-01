package somejavafile;
class box{
    box(int height,int width){
        int area = height * width;
        System.out.println(area);
    }
}
class weight extends box{
    weight(int height,int width,int length){
        super(height,width);

    }
}

public class superconstructor {
    public static void main(String args[]){

    }
}
