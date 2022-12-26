import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<User> woman = new ArrayList<>();
        List<User> oldMan = new ArrayList<>();
        int p = 1000;
        int[] run=new Random().ints(1,p+2).distinct().limit(p+1).toArray();
        for (int i=0;i<=p;i++){
            User user =new User(run[i],Name_gen.genName(),(int) (Math.random() * 110));

            users.add(user);
        }
        System.out.println("All users: "+users+"\nРазмер списка "+users.size());
        for (User user :users) {
            if (user.getName().equals("Алиса")||user.getName().equals("Арина")||user.getName().equals("Вика")){
                woman.add(user);
            }
        }
        System.out.println("Only woman: "+woman+"\nРазмер списка "+woman.size());
        for (User user :users) {
            if (user.getAge()>50){
                oldMan.add(user);
            }
        }
        System.out.println("Only old mans "+oldMan+"\nРазмер списка "+oldMan.size());
    }
}