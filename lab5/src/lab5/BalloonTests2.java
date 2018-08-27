package lab5;

import static org.junit.Assert.*;

import org.junit.Test;
import balloon1.Balloon;
public class BalloonTests2 {

	@Test
	public void testRadius() {
		Balloon ball = new Balloon(10);
		assertEquals(0, ball.getRadius());
	}
	@Test
	public void testPooped() {
		Balloon ball = new Balloon(10);
		assertEquals(false, ball.isPopped());
	}
	@Test
	public void testBlow() {
		Balloon ball = new Balloon(10);
		ball.blow(5);
		assertEquals(5, ball.getRadius());
	}
	@Test
	public void testPopped() {
		Balloon ball = new Balloon(10);
		ball.pop();
		assertEquals(true, ball.isPopped());
	}
	@Test
	public void testPopped2() {
		Balloon ball = new Balloon(10);
		ball.pop();
		ball.pop();
		assertEquals(true, ball.isPopped());
	}
	@Test
	public void testPopThanAir() {
		Balloon ball = new Balloon(10);
		ball.pop();
		ball.blow(11);
		assertEquals(11, ball.getRadius());
	}
}
