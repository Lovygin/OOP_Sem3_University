package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Переопределение итератора для класса <Student>
 */
public class StudentIterator implements Iterator<Student> {
    private int counter = 0; // индекс курируемой позиции в итерируемом объекте
    private List<Student> students; // Итерируемый объект

    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() { // Не принимает список внутри класса итератора
        return counter < students.size();
    }


    @Override
    public Student next() {
        return students.get(counter++);
    }
}
