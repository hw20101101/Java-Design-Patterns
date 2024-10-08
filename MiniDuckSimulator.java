
//模拟测试类

public class MiniDuckSimulator {
    public static void main(String[] args) {
        //普通鸭
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();

        // 火箭动力飞行鸭
        Duck duck2 = new SimUDuck();
        duck2.performQuack();
        duck2.performFly();
    }   
}