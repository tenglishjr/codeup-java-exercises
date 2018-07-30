public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish(599, "Spaghetti", true);

        System.out.println(dish.getNameOfDish());
        dish.setNameOfDish("Lasagna");
        System.out.println(dish.getNameOfDish());




//        dish.costInCents = 599;
//        dish.nameOfDish = "Slice of Pizza";
//        dish.wouldRecommend = true;
//        System.out.println(dish.costInCents);
//        System.out.println(dish.nameOfDish);
//        System.out.println(dish.wouldRecommend);
//        dish.eat();

    }

}
