//策略模式 - 抽象鸭子类

// import FlyBehavior.java;
// import QuackBehavior.java;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() { }
    public abstract void display();

    public void performFly() {
        // 委托给行为类
        flyBehavior.fly();
    }

    public void performQuack() {
        // 委托给行为类
        quackBehavior.quack();
    }    

    public void swim() {
        System.out.println("I can swim");
    }
}
