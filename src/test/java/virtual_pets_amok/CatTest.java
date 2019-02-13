package virtual_pets_amok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class CatTest {
	
	Cat underTest = new Cat("Sonny", 10,10,10);
	
	@Test
	public void shouldHaveAName() {
		String checkName = underTest.getName();
		assertThat(checkName, is("Sonny"));
	}
	
	@Test
	public void shouldHaveAHungerOf10 () {
		int checkHunger = underTest.getHunger();
		assertThat(checkHunger, is (10));
	}
	
	

}
