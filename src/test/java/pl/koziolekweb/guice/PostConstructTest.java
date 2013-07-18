package pl.koziolekweb.guice;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import javax.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: koziolek
 * Date: 18.07.13
 * Time: 21:25
 * To change this template use File | Settings | File Templates.
 */

@Guice(modules = {PostConstructModule.class, TestModule.class})
public class PostConstructTest {

	@Inject
	SimpleObjectWithPostConstruct simpleObjectWithPostConstruct;

	@Test
	public void testMethodCalled() throws Exception {
		simpleObjectWithPostConstruct.assertCall();
	}
}
