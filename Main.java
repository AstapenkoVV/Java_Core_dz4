/**
 * 1. В класс покупателя добавить перечисление с гендерами, добавить в сотрудника
 * свойство «пол» со значением созданного перечисления. Добавить геттеры, сеттеры.
 * 2. Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля),
 * написать метод, принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом,
 * женщин с 8 марта, а мужчин с 23 февраля, если сегодня соответствующий день.
 */

package lisson4_dz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Ivan", 65000.0, "1990-01-21", Gender.MALE);
        employees[1] = new Employee("Pavel", 45000.0, "1992-03-14", Gender.MALE);
        employees[2] = new Employee("Andrey", 62000.0, "1987-02-28", Gender.MALE);
        employees[3] = new Employee("Anna", 73000.0, "1995-07-11", Gender.FEMALE);
        findCurrentDate();

        System.out.println(Arrays.toString(employees));
        celebrate(employees, findCurrentDate());
    }

    private static void celebrate(Employee[] employees, Parties today) {
        for (int i = 0; i < employees.length; i++) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(employees[i].getName() + ", с Новым Годом!");
                    break;
                case FEB_23:
                    if (employees[i].getGender() == Employee.Genders.MALE)
                        System.out.println(employees[i].getName() + ", с 23 февраля!");
                    break;
                case MARCH_8:
                    if (employees[i].getGender() == Employee.Genders.FEMALE)
                        System.out.println(employees[i].getName() + ", с 8 марта!");
                    break;
                default:
                    System.out.println(employees[i].getName() + ", сегодня праздника нет!");
            }
        }
    }

    private static Parties findCurrentDate() {
        java.time.LocalDate currentDate = java.time.LocalDate.now();
        String str = String.valueOf(currentDate);
        str = str.substring(5);
        System.out.println("\nТекущая дата: " + currentDate);
        Parties parties = Parties.NONE;
        if (str.equals("01-01")) parties = Parties.NEW_YEAR;
        if (str.equals("02-23")) parties = Parties.FEB_23;
        if (str.equals("03-08")) parties = Parties.MARCH_8;
        return parties;
    }
}
