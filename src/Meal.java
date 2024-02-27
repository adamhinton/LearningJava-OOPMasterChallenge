public class Meal {

}

class Hamburger{
    private String burgerType = "hamburger";
    private double price;
    private int toppingsCount = 0;

    public Hamburger(String burgerType, double price) {
        this.burgerType = burgerType;
        this.price = price;
    }

    public void addToppings(String top1, String top2, String top3, String top4, String top5){
        if(!top4.isEmpty()){
            double extraCharge = getExtraToppingPrice(top4);
            this.price +=extraCharge;
        }
        if(!top5.isEmpty()){
            double extraCharge = getExtraToppingPrice(top4);
            this.price +=extraCharge;
        }
    }

    private double getExtraToppingPrice(String topping){
        return switch (topping){
            case "lettuce" -> .50;
            case "tomato" -> .25;
            case "onion" -> .75;
            case "mayo" -> 0.80;
            case "ketchup" -> 0.9;
            default -> 1.00;
        };
    }
}

class Drink {
    private String drinkType = "Coke";
    private String drinkSize;
    private double price;

    public double getPrice() {
        return price;
    }

    public Drink(String drinkType, String drinkSize) {
        this.drinkType = drinkType;
        this.drinkSize = drinkSize;
        this.price = switch(drinkSize){
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 2.20;
        };


    }

    public double getDrinkPrice() {
        return price;
    }
}



class Side{
    private String sideType = "fries";
    private double price;

    public Side(String sideType) {
        this.sideType = sideType;
        this.price = switch(sideType){
            case "fries" -> 2.50;
            case "coleslaw" -> 3.00;
            case "hashbrowns" -> 2.20;
            default -> 2.00;
        };
    }

    public double getPrice() {
        return price;
    }
}