public class Name_gen {
    public static String genName(){
        String[] name = {"Дмитрий","Виктор","Андрей","Илья","Алиса","Арина","Вика"};
        int in = (int) (Math.random() * name.length);
        String newName = name[in];
        return newName;
    }
}
