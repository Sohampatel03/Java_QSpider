public class Run{
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.name = "Soham";
        e1.company = "AWS";
        e1.salary = 100;
        e1.empDetails();
        e1.increament();
        Student s1 = new Student();
        s1.name = "Soham";
        s1.physics = 90;
        s1.chemistry = 90;
        s1.maths = 90;
        s1.optional = 90;
        s1.studentDetails();
        s1.percentage();
    }
}