public class Manager extends Employee {
    private int bonus;
    public Manager(String name, int id, int bonus) {
        super(name, id);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Manager 's salary is calculated with a bonus of " + bonus);
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
