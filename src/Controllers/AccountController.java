package Controllers;

import Domen.*;

import java.util.List;

public class AccountController {
    /**
     * Метод выводит на экран зарплату сотрудника, переданную в параметрах
     *
     * @param person
     * @param salary
     * @param <T>    в рамках Person
     * @param <V>    в рамках Number
     */
    public static <T extends WorkingPerson, V extends Number> void paySalary(T person, V salary) {
        System.out.println(person.getName() + " received a salary equal to: " + salary);
    }

    /**
     * Метод выводит в консоль и возвращает средний возраст исследуемой группы людей
     *
     * @param persons группа людей
     * @param <T>     метод предусмотрен для всех участников абстрактного родителя Person
     *                Student, Teacher, Employee
     * @return возвращает средний возраст с типом данных float
     */
    public static <T extends Person> float averageAge(List<T> persons) {
        int sumOfAge = 0;
        for (T person : persons) {
            sumOfAge += person.getAge();
        }
        float averageAge = (float) sumOfAge / persons.size();
        System.out.println("The average age of researched persons equals to: "
                + averageAge);
        return averageAge;
    }
}
