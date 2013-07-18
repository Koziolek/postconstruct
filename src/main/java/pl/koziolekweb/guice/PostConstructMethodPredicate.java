package pl.koziolekweb.guice;

import com.google.common.base.Predicate;

import javax.annotation.Nullable;
import javax.annotation.PostConstruct;
import java.lang.reflect.Method;

/**
* Created with IntelliJ IDEA.
* User: koziolek
* Date: 15.07.13
* Time: 21:16
* To change this template use File | Settings | File Templates.
*/
public class PostConstructMethodPredicate implements Predicate<Method> {

	public static PostConstructMethodPredicate I = new PostConstructMethodPredicate();

	@Override
	public boolean apply(@Nullable Method o) {
		return o.isAnnotationPresent(PostConstruct.class);
	}
}
