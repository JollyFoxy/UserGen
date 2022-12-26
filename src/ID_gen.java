import java.util.Random;

public class ID_gen {
    public static int genID(){
        Integer ch = 0;
        int[] arr=new Random().ints(1,99).distinct().limit(10).toArray();
        return ch;
    }
}
