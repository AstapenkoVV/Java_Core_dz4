package lisson4_dz;


public class Employee {
    public static Gender Genders;
    private String name;
    private Double salary;
    private String date;
    private Gender gender;

    public Employee(String name, Double salary, String date, Gender gender) {
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Gender getGender() {
        return gender;
    }
    
    @Override
    public String toString() {
        return "\nИмя сотрудника: " + name +
                ", зарплата: " + salary +
                ", дата рождения: " + date +
                ", пол сотрудника: " + gender;
    }
}
