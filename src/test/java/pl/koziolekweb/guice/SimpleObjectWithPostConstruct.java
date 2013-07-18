package pl.koziolekweb.guice;

import org.fest.assertions.Assertions;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: koziolek
 * Date: 18.07.13
 * Time: 21:27
 * To change this template use File | Settings | File Templates.
 */
public class SimpleObjectWithPostConstruct {

	private boolean called = false;

	@PostConstruct
	public void callMe(){
		this.called = true;
	}

	public void assertCall(){
		Assertions.assertThat(called).isTrue();
	}
}
