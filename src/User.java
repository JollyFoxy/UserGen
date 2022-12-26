public class User {
    private Integer  id;
    private String name;
    private int age;

    public User(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "ID: "+id+" Name: "+name+" Age: "+age ;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}