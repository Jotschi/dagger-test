package dagger.test;

import java.awt.Point;

public class MainTest {

    public static void main(String[] args) {
        DummyTestComponent c = DaggerDummyTestComponent.builder().myPoint(new Point(41, 41)).build();
        System.out.println(c.point().x);
    }
}
