package entities;

public class funcionarioLista {
    private Integer id;
    private String name;
    private Double salary;

    public funcionarioLista(Integer id, String name, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
