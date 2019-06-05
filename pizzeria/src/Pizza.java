import java.util.Collection;

public class Pizza extends Product{
    private Integer poziomOstrosci = 0;

    private Collection<PizzaComponent> components;

    public Pizza() {

    }

    public Pizza(String name, Collection<PizzaComponent> pizzaComponents) {
        this.name = name;
        this.components  = pizzaComponents;
    }

    public Collection<PizzaComponent> getComponents() {
        return components;
    }

    public void setComponents(Collection<PizzaComponent> components) {
        this.components = components;
    }

    public void addComponent(PizzaComponent component) {
        components.add(component);
    }

    public Integer getPoziomOstrosci() {
        return poziomOstrosci;
    }

    public void setPoziomOstrosci(Integer poziomOstrosci) {
        this.poziomOstrosci = poziomOstrosci;
    }
}
