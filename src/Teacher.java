public class Teacher extends Person{
    private final double salary;
    public Teacher(String name, String address, double salary) {
        super(name, address);
        this.salary= salary;
    }

    public String toString(){
        return getName() + "\n " + getAddress() + "\n" + " Salary " + salary + " euro/month.";
    }
}
