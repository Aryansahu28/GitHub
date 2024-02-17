class Student{
    int rollno;
    String name;

}
public class arrayobject {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Rajesh";
        s1.rollno = 12;

        Student s2 = new Student();
        s2.name = "Suresh";
        s2.rollno = 14;

        Student s3 = new Student();
        s3.name = "AA";
        s3.rollno = 1;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].rollno);
        }


        
    }
}
