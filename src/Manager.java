import java.util.Random;
public class Manager implements EmployeePosition {
    public int fix=30000, bon;
    Random rand=new Random();
    void Generatebon(){
        bon= (int) ((rand.nextInt(25001)+115_000)*0.05);
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return (fix+bon);
    }
}
