public class Interface_Mother implements Human_Interface {

    @Override
    public void eat() {
        System.out.println("엄마가먹어요");
    }

    @Override
    public void sleep() {
        System.out.println("엄마가잠");
    }

    @Override
    public void wash() {
        System.out.println("엄마가씻어요");
    }
}
