public class Dog {

    public String name;
    public String breed;
    public final String animalType = "Canine";
    public boolean canBreed;
    public int age;

    public void callDog(String name) {

        if (name.equalsIgnoreCase(this.name)) {
            System.out.println(name + " is walking towards you...");
        } else {
            System.out.println(name + " walks away...");
        }
    }

}
