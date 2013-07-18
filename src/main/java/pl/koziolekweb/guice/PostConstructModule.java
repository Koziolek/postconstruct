package pl.koziolekweb.guice;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 * Created with IntelliJ IDEA.
 * User: koziolek
 * Date: 18.07.13
 * Time: 20:45
 */
public class PostConstructModule extends AbstractModule{
	@Override
	protected void configure() {
		bindListener(Matchers.any(), new PostConstructListener());
	}
}
