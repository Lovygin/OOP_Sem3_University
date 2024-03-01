package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Переопределение итератора для класса <Employee>
 */
public class EmployeeIterator implements Iterator<Employee> {
    private int counter = 0; // индекс курируемой позиции в итерируемом объекте
    private List<Employee> employees; // Итерируемый объект

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() { // Не принимает список внутри класса итератора
        return counter < employees.size();
    }


    @Override
    public Employee next() {
        return employees.get(counter++);
    }
}