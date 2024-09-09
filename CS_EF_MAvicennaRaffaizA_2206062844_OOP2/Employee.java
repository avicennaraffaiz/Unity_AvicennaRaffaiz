public class Employee extends Person implements CalculateSalary 
{
    private Position position;
    private Division division;
    
    public Employee(String name, int id, Position position, 
    Division division) {
        super(name, id);
        this.position = position;
        this.division = division;
    }
    
    public void receiveTask(String task) {
        System.out.println("Karyawan" + getName() + "menerima tugas: " + task);
    }
    
    @Override
    public double totalSalary() {
        return 0;   // tergantung jenis karyawan
    }
}
