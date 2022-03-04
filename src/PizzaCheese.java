public class PizzaCheese extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Pizza cheese : prepare");
    }

    @Override
    public void bake() {
        System.out.println("Pizza cheese : bake");
    }

    @Override
    public void cut() {
        System.out.println("Pizza cheese : cut");
    }

    @Override
    public void box() {
        System.out.println("Pizza cheese : box");
    }
}
