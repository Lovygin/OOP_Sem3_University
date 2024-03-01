package Services;

import Domen.Employee;
import Domen.PersonComparator;
import Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService extends PersonComparator<Teacher> implements iPersonService<Teacher> {

    private int count;
    private List<Teacher> teacherList;

    public TeacherService(List<Teacher> teacherList) {
        this.teacherList = new ArrayList<Teacher>();
    }

    @Override
    public List getAll() {
        return this.teacherList;
    }

    /**
     * Метод принимает данные нового учителя и создает его. Добавляет в коллектив преподавателей.
     *
     * @param name
     * @param age
     */
    @Override
    public void create(String name, int age) {
        Teacher newTeacher = new Teacher(name, age, "indeterminately");
        teacherList.add(newTeacher);
        count++;
    }

    /**
     * Метод сортирует преподавательский коллектив по алфавиту.
     */
    public void sortByFIO() {
        PersonComparator<Teacher> comparator = new PersonComparator<>();
        this.teacherList.sort(comparator);
    }

    /**
     * Метод выводит список учителей в алфавитном порядке
     */
    public void printSortTeacherList() {
        sortByFIO();
        System.out.println(this.teacherList);
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
