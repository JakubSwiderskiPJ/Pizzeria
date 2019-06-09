
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        Order order = new Order();
        Integer foodId;
        Integer foodOptionId;
        Integer size;
        Integer quantity;
        Integer counter = 0;
        String name = "";
        Product product = new Pizza();
        Collection<PizzaComponent> pizzaComponents = null;
        System.out.println("Wprowadz ile produktow chcesz zamowic");

        quantity = sc.nextInt();
        while (counter != quantity) {
            System.out.println("Witaj wproawdż produkt jaki chcesz 1: Pizza 2: Salatka");

            foodId = sc.nextInt();
            try {
                switch(foodId) {
                    case 1:
                        System.out.println("Podaj jaka pizze chcialbys otrzymac - 1: Wegetarianska 2: Capriciosa 3: Pepperoni ");
                        foodOptionId = sc.nextInt();
                        product = new Pizza();

                        /**Wegetarianska **/
                        if (foodOptionId == 1) {
                            name = "Wegetarianska";
                            pizzaComponents.add(new PizzaComponent(new String("papryka")));
                            pizzaComponents.add(new PizzaComponent(new String("pomidor")));
                            pizzaComponents.add(new PizzaComponent(new String("ser")));
                            product.setName(name);
                            ((Pizza) product).setComponents(pizzaComponents);
                            /** Capriciosa **/
                        } else if (foodOptionId == 2) {
                            name = "Capriciosa";
                            pizzaComponents.add(new PizzaComponent(new String("pieczarki")));
                            pizzaComponents.add(new PizzaComponent(new String("sos")));
                            pizzaComponents.add(new PizzaComponent(new String("szynka")));
                            product.setName(name);
                            ((Pizza) product).setComponents(pizzaComponents);
                            /** Pepperoni **/
                        } else if (foodOptionId == 3) {
                            name = "Pepperoni";
                            pizzaComponents.add(new PizzaComponent(new String("salami")));
                            pizzaComponents.add(new PizzaComponent(new String("papryka ostra")));
                            pizzaComponents.add(new PizzaComponent(new String("cebula")));
                            pizzaComponents.add(new PizzaComponent(new String("ser")));
                            product.setName(name);
                            ((Pizza) product).setComponents(pizzaComponents);
                            ((Pizza) product).setPoziomOstrosci(2);
                        } else {
                            System.out.println("Nie ma takiej opcji");
                            System.exit(0);
                        }
                        break;
                    case 2:
                        System.out.println("Podaj jaka salatke chcialbys otrzymac - NA RAZIE NIE MAMY :C");
                        break;
                    default:
                        System.out.println("Zly produkt");
                        System.exit(0);
                }

                System.out.println("Wprowadz teraz rozmiar pizzy 1: Mala 2: Srednia 3: Duza");
                size = sc.nextInt();

                product.setSize(size);


                Pizza pizza = new Pizza(name, pizzaComponents);

            } catch (NullPointerException ex) {
                System.out.println("Nie udalo sie stworzyc produktu");
            }
        }
        System.out.println("Stworzylem pizze");
    }
}
