public class BurgerTester {

    public static void main(String[] args) {

        System.out.println(BurgerTools.mostPopularTopping);
        System.out.println(BurgerTools.averageDaysBeforeExpiration);
        System.out.println(BurgerTools.temperatureWhenCooked);
        BurgerTools.grill();
        BurgerTools.flipPatty();
    }

}
