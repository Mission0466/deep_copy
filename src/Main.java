//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    public static void doSomething(Person p){
//        p = new Person(p);
//        System.out.println(p);
//    }

    public static void main(String[] args) {
        Person p1 = new Person("Aman", "delhi", 26);
//        doSomething(p1);

        Person p2 = new Person(p1);

        p2.setAddress("mumbai");
        System.out.println(p1); // Outputs: Aman, 26 years old, lives at 123 Main St, Springfield
       System.out.println(p2);
    }
}