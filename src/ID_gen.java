public class ID_gen {
    public static int genID(){
        Integer ch = 0;
        ch = (int) (Math.random()*1000000);
        return ch;
    }
}
