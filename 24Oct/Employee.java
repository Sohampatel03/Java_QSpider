public class Employee{
    String name ;
    String company;
    double salary;
    public void empDetails(){
      System.out.println(name+" "+company+" "+salary);
    }
    public void increament(){
        salary = salary+(salary*10)/100;
        System.out.print("increamented salary is"+salary);
    }
}