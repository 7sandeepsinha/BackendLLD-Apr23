package encapsulation;

public class Client {
    public static void main(String[] args) {
        Student ayush = new Student(); // ayush student obj
        ayush.name = "Ayush";
        ayush.marks = 85;
        ayush.age = 25;

        ayush.greet(); // this -> ayush
        ayush.displayDetails();

        Student navneet = new Student(); // navneet student obj
        navneet.name = "Navneet";
        navneet.age = 26;
        navneet.marks = 88;

        navneet.greet();
        navneet.displayDetails();

        Square s1 = new Square();
        s1.side = 4;

        s1.getArea(); // this -> current object
        s1.getPerimeter();

        Square s2 = new Square();
        s2.side = 6;

        s2.getArea();
        s2.getPerimeter();
    }
}
