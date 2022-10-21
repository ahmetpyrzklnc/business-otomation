package otomation_business;

public class EmployeeManager {

    private int id;
    private String name;
    private String surname;
    private String departman;
    private int salary;

    public EmployeeManager(int id, String name, String surname, String departman, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.departman = departman;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
