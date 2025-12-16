package dagger.test;

import java.awt.Point;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { DummyModule.class})
public interface DummyComponent {

    Point point();
}
