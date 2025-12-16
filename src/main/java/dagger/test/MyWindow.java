package dagger.test;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Window;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyWindow extends Window {

	@Inject
	public MyWindow() throws HeadlessException {
		super(new Frame());
	}

	private static final long serialVersionUID = 8620736553553627817L;

}
