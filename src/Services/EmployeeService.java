package Services;

import Domen.Employee;
import Domen.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> employeeList;

    public EmployeeService(List<Employee> employeeList) {
        this.employeeList = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        return this.employeeList;
    }

    /**
     * Метод принимает данные нового работника и создает его. Добавляет в коллектив преподавателей.
     *
     * @param name
     * @param age
     */
    @Override
    public void create(String name, int age) {
        Employee newEmployee = new Employee(name, age, "indeterminately"); // неопределено
        employeeList.add(newEmployee);
        count++;
    }

    /**
     * Метод сортирует персонал университета по алфавиту.
     */

    public void sortByFIO() {
        PersonComparator<Employee> comparator = new PersonComparator<>();
        this.employeeList.sort(comparator);
        //this.employeeList.sort(new PersonComparator<Employee>());
    }
}
