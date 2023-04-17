package inheritanceAndPolymorphism;

public class Employee {
    private int id;
    private int salary;
    private String name;

    public int getId(){
        //first verify here and then go to next line
        return this.id;
    }

    public void setId(int id){
        //first verify here and then go to next line
        this.id = id;
    }

    public int getSalary(){
        //first verify here and then go to next line
        return this.salary;
    }

    public void setSalary(int salary){
        //first verify here and then go to next line
        if(salary <=0 ){
            System.out.println("Invalid salary");
        }else{
            this.salary = salary;
        }
    }

    public String getName() {
        //first verify here and then go to next line
        return name;
    }

    public void setName(String name) {
        //first verify here and then go to next line
        this.name = name;
    }
}
