package Services;

import Domen.PersonComparator;
import Domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> studentList;

    public StudentService(List<Student> studentList) {
        this.studentList = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return this.studentList;
    }

    @Override
    public void create(String name, int age) {
        Student newStudent = new Student(name, age);
        studentList.add(newStudent);
        count++;

    }

    public void sortByFIO() {
//        PersonComparator<Student> comparator = new PersonComparator<Student>();
//        this.studentList.sort(comparator);
        this.studentList.sort(new PersonComparator<Student>());
    }

}
