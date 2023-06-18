import java.util.Objects;

public class Employee {
    private int regno;
    private String name;

    //constructor of Employee class
    public Employee(int regno, String name) {
        this.name = name;
        this.regno = regno;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int Regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return regno == employee.regno && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regno, name);
    }
}