package Administracion_empleados.modelos;

public class Empleado {
    private String name;
    private int age;
    private float salary;
    private String department;

    public Empleado(String name, int age, float salary, String department){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    public Empleado(){}

    public int getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
    public String getName() {
        return name;
    }
    public float getSalary() {
        return salary;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void increaseSalary(float increasePercentage){
        this.salary = this.salary * increasePercentage/100;
    }
}
