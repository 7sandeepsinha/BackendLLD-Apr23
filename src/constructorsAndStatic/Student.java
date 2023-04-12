package constructorsAndStatic;

public class Student {
    String name;
    int age;
    int roll;
    double marks;

    //no args constructor
    Student(){ //java identifies this constructor as Student()
        //here only age and roll is getting initialised, every other attribute will hold default values
        this.age = 15; // this -> refers to the object being created by the constructor
        this.roll = 10;
    }

    //student getting admission scenario, we know name and age but not marks and roll
    //parameterised constructor {as a good practice, always name your parameters same as attributes of the class}
    Student(String name, int age){ //java identifies this constructor as Student(String, int)
        //here only name and age is getting initialised, every other attribute will hold default values
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, int roll, double marks){ //java identifies this constructor as Student(String, int, int, double)
        //all the attributes are being initialised
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.marks = marks;
    }

    //copy constructor -> passing object of same class, to read the values, create a new obj and initialise them with the values of the object being passed as a parameter
    Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.marks = student.marks;
        this.roll = student.roll;
    }

    void displayDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Roll : " + this.roll);
        System.out.println("Marks : " + this.marks);
    }
}


/*
    class NAME{
        attributes

        constructors

        methods
    }
 */