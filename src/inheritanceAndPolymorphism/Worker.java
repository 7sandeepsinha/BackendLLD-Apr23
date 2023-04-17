package inheritanceAndPolymorphism;

public class Worker extends Human{ // S2 -> newer TV

    private int salary;

    public void salaryPaid(){
        System.out.println("Salary is pain to worker");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
