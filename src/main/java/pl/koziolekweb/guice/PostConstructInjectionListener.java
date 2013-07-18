package pl.koziolekweb.guice;


import com.google.inject.spi.InjectionListener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

import static com.google.common.collect.Collections2.*;
import static com.google.common.collect.Collections2.filter;
import static java.util.Arrays.asList;

/**
 * Created with IntelliJ IDEA.
 * User: koziolek
 * Date: 15.07.13
 * Time: 21:17
 * To change this template use File | Settings | File Templates.
 */
public class PostConstructInjectionListener<I> implements InjectionListener<I> {

	@Override
	public void afterInjection(final I injectee) {
		Collection<Method> postConstructMethods = filter(asList(injectee.getClass().getDeclaredMethods()), PostConstructMethodPredicate.I);
		for (Method postConstructMethod : postConstructMethods) {
			try {
				postConstructMethod.invoke(injectee);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}
}
