package dagger.test;

import java.awt.Button;
import java.awt.Point;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = { DummyModule.class})
public interface DummyTestComponent {

	@Component.Builder
	interface Builder {

		@BindsInstance
		Builder myPoint(Point point);

		/**
		 * Build the component.
		 * 
		 * @return
		 */
		DummyTestComponent build();

	}
	
	Button button();
	
    Point point();
}
