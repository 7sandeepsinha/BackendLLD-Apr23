package constructorsAndStatic;

public class Client {
    public static void main(String[] args) {
        Student nilesh = new Student();
        nilesh.displayDetails();
        nilesh.age = 20;
        nilesh.displayDetails();

        System.out.println("--------------");
        Student chirag = new Student();
        chirag.displayDetails();

        System.out.println("--------------");
        Student chandan = new Student("Chandan", 15);
        chandan.displayDetails();

        System.out.println("--------------");
        Student gauhar = new Student("Gauhar", 15, 3, 96.8);
        //Student gauhar = new Student("Gauhar", 15, 3, 96.8);
        gauhar.displayDetails();

        /***
         * Demo for deep copy vs shallow copy
         */
        System.out.println("DEMO FOR DEEP COPY VS SHALLOW COPY");
        //SHALLOW COPY
        Student s1 = new Student("S1", 10,1,100);
        Student s2 = s1;
        s1.displayDetails();
        s2.age = 15;
        s1.displayDetails();
        System.out.println("-----------------");
        //DEEP COPY
        Student s10 = new Student("S10",20,2,200);
        Student s20 = new Student(s10);
        s10.displayDetails();
        s20.displayDetails();

        System.out.println("---------------");
        FixedDeposit.printFDDetails();
    }
}
