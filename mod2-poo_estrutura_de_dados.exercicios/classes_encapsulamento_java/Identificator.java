import java.util.Random;

public class Identificator {
    /*
    public static void main(String[] args){
        Identificator id1 = new Identificator();
        System.out.println(id1.getId());
    }
    */
    private Random range = new Random();
    private final int num = range.nextInt(500);

    Identificator(){
    }

    public int getId() {
        return this.num;
    }
}
