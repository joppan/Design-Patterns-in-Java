public interface PizzaBuilder {

    public void buildDough();
    public void buildSauce();
    public void buildTopping();

    public Pizza getPizza();
}