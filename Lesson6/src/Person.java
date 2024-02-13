public class Person {
    private int Id;
    private String name;
    private int age;
    private static int IdCounter = 0;

    public Person(String name, int age) {
        this.Id = IdCounter++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
