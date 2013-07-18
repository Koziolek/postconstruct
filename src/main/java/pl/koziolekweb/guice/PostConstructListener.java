package pl.koziolekweb.guice;

import com.google.inject.TypeLiteral;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;

/**
* Created with IntelliJ IDEA.
* User: koziolek
* Date: 15.07.13
* Time: 21:26
* To change this template use File | Settings | File Templates.
*/
class PostConstructListener implements TypeListener {
	@Override
	public <I> void hear(TypeLiteral<I> type, TypeEncounter<I> encounter) {
		encounter.register(new PostConstructInjectionListener<I>());
	}

}
