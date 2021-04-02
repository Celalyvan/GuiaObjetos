package dominio;

public class Employee {
    private String name;
    private String surname;
    private double salary;
    private long dni;

    public Employee() {
    }

    public Employee(String name, String surname, double salary, long dni) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.dni = dni;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getDni() {
        return this.dni;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado[");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", dni=").append(dni);
        sb.append(']');
        return sb.toString();
    }



}
