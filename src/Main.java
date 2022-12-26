import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<Integer, String>();
        for (int i=0;i<=10;i++){
            User user =new User(ID_gen.genID(),Name_gen.genName(),(int) (Math.random() * 110));
            users.put(user.getId(),"Name: "+ user.getName()+ " Age: "+ user.getAge());
            System.out.println(user.getId()+"\t"+users.get(user.getId()));
        }
    }
}