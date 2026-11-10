public class Student{
    String name;
    int physics;
    int chemistry;
    int maths;
    int optional;
    public void studentDetails(){
        System.out.println(name+"\nMarks"+physics+"\n"+chemistry+"\n"+maths+"\n"+optional);
    }
    public void percentage(){
        double total = physics+chemistry+maths+optional;
        System.out.println("Percentage is = "+total/4);
    }
}