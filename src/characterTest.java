import static org.junit.Assert.*;

import org.junit.Test;

public class characterTest {

	@Test
	public void test1() {
		assertEquals("bill", new character("bill").getName());
	}
	@Test
	public void test2() {
		assertEquals("good", new character("bil0dfl", "good").getAlignment());
	}
	@Test
	public void test3() {
		assertEquals(5, new character("bill", "good").getArmorHP());
	}
	@Test
	public void test4() {
		assertEquals(10, new character().getArmorClass());
	}
	@Test
	public void test5() {
		assertEquals(true, new character().isHit());
	}
	@Test
	public void test6() {
		assertEquals(4, new character().attackThatFool());
	}
	@Test
	public void test7() {
		assertEquals(true, new character().isAlive());
	}
	int[] strength = {-5,-4,-4,-3,-3,-2,-2,-1,-1,0,0,1,1,2,2,3,3,4,4,5};

}
