public class TopManager implements EmployeePosition{
    public int fix=30000, bon;
    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return 0;
    }
}
