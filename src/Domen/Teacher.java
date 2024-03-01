package Domen;

public class Teacher extends WorkingPerson {
    private String degree; // академическая степень

    public Teacher(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.getName() + ", "
                + super.getAge()
                + "; Degree: '" + degree + '\'' +
                '}';
    }
}
