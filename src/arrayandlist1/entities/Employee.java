package arrayandlist1.entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public void addSalary(double value){
        this.salary += this.salary * value/100;
    }

    public String toString(){
        return    this.id
                + ", "
                + this.name
                +", "
                + this.salary;
    }

}
