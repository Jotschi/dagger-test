package dagger.test;

import java.awt.Point;

import javax.inject.Singleton;

import dagger.Provides;
import dagger.Module;

@Module
public class DummyModule {

    @Singleton
    @Provides
    public Point point() {
        return new Point(42, 42);
    }
}
