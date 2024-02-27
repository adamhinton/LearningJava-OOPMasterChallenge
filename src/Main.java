public class Main {
    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();


//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();



    }
}


// CHALLENGE INFO:
//Bill runs a burger joint
// Meal has three items: hamburger, drink, side item
// App lets bill select the type of burger, extras for the burger, and the actual pricing

//Need:
//meal order: Exactly one burger, one drink, one side item
// Most common meal created w no args. Like regular burger, small coke and fries frex
// Need drink, and side item
// drink has: at least type, size, price. Price changes by size/
// side has: At least type and price

//Burger:
// burger type, base price, max three extra toppings
// constructor should include only burger type and price
// Extra toppings need to be added somehow, and priced according to their type

// Deluxe burger bonus:
// create deluxe bgr meal that has a set price, so toppings don't increase price. Has room for additional two toppings.



//Can create other meal orders by spec diff bgrs drinks and sides


//MAIN:
// Creat default meal with no args constr
// make meal w bgr, and drink and side of your choice, with <=3 extra toppings
// create a deluxe meal, where all items, drink, side and tpgs up to 5 extras, are included in price
// For each meal, do:
    // add toppings to burger
    // Change size of drink
    // print itemized list. Includes price of burger, extra toppings, drink price based on size, and side item price
    // Print total due amount for meal
