package entities;

public class funcionario {
    public String name;
    public double grosSalary;
    public double tax;

    public double desconto() {
        return grosSalary - tax;
    }

    public void incrementarSalario(double porcentagem) {
        grosSalary += grosSalary * porcentagem / 100.0;
    }

    public String toString() {
        return "Funcionario: " +
                name +
                ", " +
                "$ " +
                "Seu salário é: " +
                this.desconto();
    }

}
