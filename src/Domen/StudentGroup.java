package Domen;

import java.util.Iterator; // интерфейс для итерации объектов класса
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> { // Переопределяем класс Iterator, создав класс StudentIterator
    private int idStudentGroup;
    private static int idGenerator = 1;
    private List<Student> studentList;
    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
        this.idStudentGroup = idGenerator++;
    }
    public int getIdStudentGroup() {
        return idStudentGroup;
    }

    public void setIdStudentGroup(int idStudentGroup) {
        this.idStudentGroup = idStudentGroup;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }



//    public int getGroupLength(){
//        return this.studentList.size();
//    }

    @Override
    public String toString() {
        System.out.println( "Group id: " + idStudentGroup + "\n" +
                "Number of students at the group = " +
                this.studentList.size() + "\n" +
                "List of students: ");
        for (Student student:studentList) {
            System.out.println(student.toString());
        }
        return "";
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList); // Создаем новый экземпляр итератора, принимающий список группы студентов
    }
    /**
     * Переопределенный метод интерфейса Comparable
     * @apiNote сортировка групп студентов в потоке
     * по 2-м признакам (численность группы(gen) и id группы студента)
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(StudentGroup o) {
        //System.out.println(this.studentList.size() + " - " + o.studentList.size());
        if (this.studentList.size() > o.studentList.size()) return 1;
        if (this.studentList.size() < o.studentList.size()) return -1;
        if (this.getIdStudentGroup() > o.getIdStudentGroup()) return 1;
        if (this.getIdStudentGroup() < o.getIdStudentGroup()) return -1;
        return 0;
    }
}
