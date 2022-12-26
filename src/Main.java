import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();
        Scanner scanner =new Scanner(System.in);
        int p = 10;
        int[] run=new Random().ints(1,1000).distinct().limit(p+1).toArray();
        for (int i=0;i<=p;i++){
            User user =new User(run[i],Name_gen.genName(),(int) (Math.random() * 110));
            users.add(user.toString());
            System.out.println(users.get(i));
        }
    }
}