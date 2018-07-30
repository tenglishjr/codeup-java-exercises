public class Person {

    // Problem 1.

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }

    public Person (String name) {
        this.name = name;
    }

    public static void main(String[] args) {

//        Person person = new Person("Bob");
//        System.out.println(person.getName());
//        person.sayHello();
//        person.setName("Phil");
//        person.sayHello();

        // Problem 2

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // Expected o/p: true
//        System.out.println(person1 == person2);                          // Expected o/p: false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);                          // Expected o/p: true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//
//        System.out.println(person1.getName());                           // Expected o/p: John
//        System.out.println(person2.getName());                           // Expected o/p: John
//
//        person2.setName("Jane");
//        System.out.println(person1.getName());                           // Expected o/p: Jane
//        System.out.println(person2.getName());                           // Expected o/p: Jane

        // Problem 3




    }


}
