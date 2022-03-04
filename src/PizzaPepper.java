public class PizzaPepper extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Pizza Pepper : prepare");
    }

    @Override
    public void bake() {
        System.out.println("Pizza Pepper : bake");
    }

    @Override
    public void cut() {
        System.out.println("Pizza Pepper : cut");
    }

    @Override
    public void box() {
        System.out.println("Pizza Pepper : box");
    }
}
