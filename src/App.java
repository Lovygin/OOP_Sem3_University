import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @apiNote Проект автоматизации работы университета
 */
public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(); // первичный список группы студентов
        Student student1 = new Student("Arkasha", 18);
        Student student2 = new Student("Mirosha", 24);
        Student student7 = new Student("Nikon", 22);
        Student student3 = new Student("Maksusha", 17);
        Student student4 = new Student("Arisha", 21);
        Student student8 = new Student("Sofia", 22);
        Student student5 = new Student("Nikita", 19);
        Student student9 = new Student("Sasha", 24);
        Student student6 = new Student("Lubovia", 22);

        students.add(student1);
        students.add(student2);
        students.add(student7);
        students.add(student3);
        students.add(student4);
        students.add(student8);
        students.add(student5);
        students.add(student9);
        students.add(student6);

        StudentGroup sG101 = new StudentGroup(students); // Группа студентов

        for (Student student : sG101) {
            System.out.println(student);
        }
        System.out.println("==".repeat(30));

        Collections.sort(sG101.getStudentList()); //Сортировка группы студентов по возрасту и id за счет переопределения compareTo() <Student>
        for (Student student : sG101) {
            System.out.println(student);
        }

        List<Student> studentsTwo = new ArrayList<>();
        Student student11 = new Student("Alla", 27);
        Student student12 = new Student("Egor", 20);
        Student student13 = new Student("Rada", 31);
        Student student14 = new Student("Fedor", 22);
        Student student15 = new Student("Arina", 23);
        Student student16 = new Student("Anfisa", 24);
        Student student17 = new Student("David", 20);
        Student student18 = new Student("Liza", 28);
        Student student19 = new Student("Arsen", 27);
        Student student20 = new Student("Klavdia", 25);
        Student student21 = new Student("Nikolay", 21);
        Student student22 = new Student("Roman", 20);

        studentsTwo.add(student11);
        studentsTwo.add(student12);
        studentsTwo.add(student13);
        studentsTwo.add(student14);
        studentsTwo.add(student15);
        studentsTwo.add(student16);
        studentsTwo.add(student17);
        studentsTwo.add(student18);
        studentsTwo.add(student19);
        studentsTwo.add(student20);
        studentsTwo.add(student21);
        studentsTwo.add(student22);

        StudentGroup sG102 = new StudentGroup(studentsTwo);
        System.out.println(sG102.toString());
        System.out.println("==".repeat(30));

        List<Student> studentsThree = new ArrayList<>();
        Student student01 = new Student("Alla", 27);
        Student student02 = new Student("Egor", 20);
        Student student03 = new Student("Rada", 31);
        Student student04 = new Student("Fedor", 22);
        Student student05 = new Student("Arina", 23);
        Student student06 = new Student("Anfisa", 24);


        studentsThree.add(student01);
        studentsThree.add(student02);
        studentsThree.add(student03);
        studentsThree.add(student04);
        studentsThree.add(student05);
        studentsThree.add(student06);
        StudentGroup sG103 = new StudentGroup(studentsThree);


        List<Student> studentsFour = new ArrayList<>();
        Student student31 = new Student("Galya", 27);
        Student student32 = new Student("Egorina", 20);
        Student student33 = new Student("Radavina", 31);
        Student student34 = new Student("Fedyr", 22);
        Student student35 = new Student("Arinariy", 23);
        Student student36 = new Student("Anf", 24);


        studentsFour.add(student31);
        studentsFour.add(student32);
        studentsFour.add(student33);
        studentsFour.add(student34);
        studentsFour.add(student35);
        studentsFour.add(student36);
        StudentGroup sG104 = new StudentGroup(studentsFour);



        StudentSteam studentSteam;
        List<StudentGroup> steam = new ArrayList<>();
        steam.add(sG101);
        steam.add(sG102);
        steam.add(sG103);
        steam.add(sG104);

        studentSteam = new StudentSteam(steam);
        System.out.println(studentSteam.toString());
        System.out.println("++".repeat(40));
        for (StudentGroup sG : steam) {
            System.out.println(sG);
        }

        Collections.sort(sG102.getStudentList());
        Collections.sort(sG103.getStudentList());
        Collections.sort(steam); //Сортировка потока студентов по численности группы и id группы за счет переопределения compareTo() <StudentGroup>

        System.out.println("==".repeat(30));


        System.out.println(studentSteam.toString());// Вывод потока в консоль

    }
}