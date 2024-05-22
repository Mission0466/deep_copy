public class Person {
    private String name;
    private String address;
    private int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Person(Person p) {
        this.name = new String(p.name); // Creating a new String instance
        this.address = new String(p.address); // Creating a new Address instance
        this.age = p.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age + " years old, lives at " + address;
    }

}
