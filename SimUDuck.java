public class SimUDuck extends Duck {

    public SimUDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithRocket();
    }

    public void display() {
        System.out.println("I am a simu duck.");
    }
}
