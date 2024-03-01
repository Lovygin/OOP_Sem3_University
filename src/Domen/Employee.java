package Domen;

/**
 * @apiNote класс, определяющий служащего в университете
 */
public class Employee extends WorkingPerson {
    private String major;

    public Employee(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Employee{" + super.getName() + ", "
                + super.getAge()
                + "; major: '" + major + '\'' +
                '}';
    }
}
