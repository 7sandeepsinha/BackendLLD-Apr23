package encapsulation;

public class Student {
    String name;
    int age;
    int marks;

    public void greet(){
        System.out.println("Hi, My name is " + this.name + " and I got " + this.marks + " marks");
    }

    public void displayDetails(){
        System.out.println("Name" + this.name);
        System.out.println("Age" + this.age);
        System.out.println("Marks" + this.marks);
    }
}
