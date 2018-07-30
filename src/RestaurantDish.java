public class RestaurantDish {

//    public int costInCents;
//    public String nameOfDish;
//    public boolean wouldRecommend;
//    public void eat () {
//        System.out.println("Nom nom nom!");
//    }

//    -- SHORT ASSIGNMENT #2 (part 2) --
//
//    Refactor your RestaurantDish and RestaurantTest classes...
//
//            1) Change your public properties in your RestaurantDish class to private
// 2) Add getters and setters for these properties (use IntelliJ to do this quickly)
// 3) Refactor code used in RestaurantTest to set and print these property values...
//            ...to use your getters and setters
// 4) Add a constructor method to RestaurantDish that will assign property...
//            ...values based on arguments passed into the constructor

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    public void eat () {
        System.out.println("Nom nom nom!");
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean getWouldRecommend () {
        return wouldRecommend;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public RestaurantDish (int costInCents) {
        this.costInCents = costInCents;
        this.nameOfDish = "Unassigned";
        this.wouldRecommend = false;
    }

    public RestaurantDish (int costInCents, String nameOfDish) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = false;
    }

    public RestaurantDish (int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }
}
