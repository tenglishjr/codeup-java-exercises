public class BurgerTools {

//    -- SHORT ASSIGNMENT #2 (part 1) --
//
//    Create a class of static properties and methods called BurgerTools
//
//    Include a string property of mostPopularTopping
//    Include an int property of averageDaysBeforeExpiration
//    Include an int property of temperatureWhenCooked
//    Include a void method called grill() that prints out "Grilling burger"
//
//    Create a class called BurgerTester to test assigning and printing property values
//            and testing methods.
//
//    If you have time, add additional properties and methods.

    public static String mostPopularTopping = "Cheese";
    public static int averageDaysBeforeExpiration = 16;
    public static int temperatureWhenCooked = 168;
    public static void grill() {
        System.out.println("Grilling burger...");
    }
    public static void flipPatty() {
        System.out.println("Now cooking the other side...");
    }

}
