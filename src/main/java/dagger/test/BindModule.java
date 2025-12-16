package dagger.test;

import java.awt.Window;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class BindModule {

    @Binds
    abstract Window window(MyWindow e);

}
