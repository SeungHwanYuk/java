package Java0401Generic;

class Apple{}

class Pencil {}
class Goods<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Goods<Apple> goods1 = new Goods<>();
        goods1.setT(new Apple());
        Apple apple = goods1.getT();

        Goods<Pencil> goods2 = new Goods<>();
        goods2.setT(new Pencil());
        Pencil pencil = goods2.getT();

        // 잘못된 타입 선언
        Goods<Apple> goods3 = new Goods<>();
        goods3.setT(new Apple());
        /*Pencil pencil2 = goods3.getT();*/
    }
}
