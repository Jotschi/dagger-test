package dagger.test;

public class Main {

    public static void main(String[] args) {
        DummyComponent c = DaggerDummyComponent.create();
        System.out.println(c.point().x);
    }
}
