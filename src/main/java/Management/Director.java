package Management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus() {
        double salary = this.getSalary();
        return salary / 50.00;
    }
}
