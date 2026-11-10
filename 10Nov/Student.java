class Student {
    private int rollno;
    private String name;
    private double marks;
    Student(int rollno, String name, double marks) {
       setRollno(rollno); 
        setName(name); 
        setMarks(marks);
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks must be in between 0 and 100");
        }
    }

    void display() {
        System.out.println(rollno + " " + name + " " + marks);
    }
}