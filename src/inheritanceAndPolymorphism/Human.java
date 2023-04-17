package inheritanceAndPolymorphism;

public class Human { //s1 -> Older TV
    private String name;
    private int age;

    public void eating(){
        System.out.println("Human is eating");
    }

    public void breathing(){
        System.out.println("Human is breathing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
