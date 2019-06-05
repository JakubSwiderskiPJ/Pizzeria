public class PizzaDecorator extends Product {
    public static void calculateCost(Pizza pizza, PizzaComponent pizzaComponent) {
        pizza.setPrice(pizza.getPrice() + pizzaComponent.getPrice());
    }

    public static void addComponent(Pizza pizza, PizzaComponent pizzaComponent) {
        pizza.addComponent(pizzaComponent);
        calculateCost(pizza, pizzaComponent);
    }
}
