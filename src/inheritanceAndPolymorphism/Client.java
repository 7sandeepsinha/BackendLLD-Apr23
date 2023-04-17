package inheritanceAndPolymorphism;

public class Client {
    public static void main(String[] args) {
//        Employee e = new Employee();
//        e.setId(1);
//        e.setSalary(100);
//        e.setName("Malkeet");
//
//        System.out.println(e.getId());
//        System.out.println(e.getName());
//        System.out.println(e.getSalary());
//
//        Cat c = new Cat();
//        c.eat();
//        c.breathe();
//
//        Dog d = new Dog();
//        d.eat();
//        d.breathe();
//
//        Deer deer = new Deer();
//        deer.eat();
//        deer.breathe();
//
//        Instructor i = new Instructor(1, "ins@email.com", "password", 5);

        Human h = new Human();
        h.breathing();
        h.eating();

        //When reference variable of parent type is used
        //to refer a child class object -> Upcasting
        //Upcasting is implicit.

        Human hWorker = new Worker(); //upcasting
        hWorker.eating();
        hWorker.breathing();

        //downcasting -> referring to parent using
        // child type reference variable.
        // Explicit because we need to mention the downcasting
        Worker w = (Worker)new Human();
        w.getSalary(); // downcasting is very prone to errors and will fail multiple time
        // Downcasting is not preffered.


    }
}
