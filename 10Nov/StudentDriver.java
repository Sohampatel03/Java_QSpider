class StudentDriver {
    public static void main(String args[]) {
        Student s1 = new Student(101, "Alice", 85.5);
        s1.display();
        s1.setMarks(105); 
        s1.setMarks(92);
        s1.display();
    }
}