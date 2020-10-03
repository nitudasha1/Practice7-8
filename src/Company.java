import java.util.Random;
public class Company {
    public int inc;
    Random rand=new Random();
    void getIncome(){
        inc= rand.nextInt(19_000_001)+1_000_000;
    }
}
