public class Intern extends Employee
{
    private double hourlyRate;
    private int hoursWorked;
    
    public Intern(String name, int id, Position position, Division division, 
    double hourlyRate, int hoursWorked) {
        super(name, id, position, division);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double totalSalary() {
        int monthlyWorked = hoursWorked * 20;   // 20 hari
        double baseSalary = monthlyWorked * hourlyRate;
        
        if (hoursWorked < 100) {
            return baseSalary;
        } else {
            double bonus = baseSalary * 0,125;
            return baseSalary + bonus;
        }
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();    // dari employee
        System.out.println("Hourly rate: " + hourlyRate);
        System.out.println("Hours worked: " + hoursWorked);
    }
}
