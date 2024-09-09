public class FullTimeEmployee extends Employee
{
    private double baseSalary;
    private double baseBonus;
    private double performanceRating;
    
    public FullTimeEmployee(String name, int id, Position position, 
    Division division, double baseSalary, double baseBonus, 
    double performanceRating) {
        super(name, id, position, division);
        this.baseSalary = baseSalary;
        this.baseBonus = baseBonus;
        this.performanceRating = Math.min(performanceRating, 1);
    }
    
    public double bonusSalary() {
        if (performanceRating < 0.3) {
            return 0;
        } else {
            return baseBonus * performanceRating;
        }
    }
    
    @Override
    public double totalSalary() {
        return baseSalary + bonusSalary();
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Nama: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Posisi: " + getPosition());
        System.out.println("Divisi: " + getDivision());
        System.out.println("Gaji Pokok: " + baseSalary);
        System.out.println("Bonus Pokok: " + baseBonus);
        System.out.println("Gaji Total: " + totalSalary());
    }
}
