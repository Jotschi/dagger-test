package dagger.test;

import java.awt.Button;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DummyModule {

	@Singleton
	@Provides
	public Button button() {
		return new Button("hello");
	}
}
