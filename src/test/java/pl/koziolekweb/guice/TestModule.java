package pl.koziolekweb.guice;

import com.google.inject.AbstractModule;

/**
 * Created with IntelliJ IDEA.
 * User: koziolek
 * Date: 18.07.13
 * Time: 21:26
 * To change this template use File | Settings | File Templates.
 */
public class TestModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(SimpleObjectWithPostConstruct.class);
	}
}
