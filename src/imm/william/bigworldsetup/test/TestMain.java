/**
 * 
 */
package imm.william.bigworldsetup.test;

import static org.junit.Assert.*;

import org.junit.*;
import imm.william.bigworldsetup.*;

/**
 * @author William Imm
 * 
 * This test is designed to test the main program and class, just to see if it works.
 *
 */
public class TestMain {

	@Test
	public void testMain() {
		BiGSetup bsetup = new BiGSetup();
		String[] blank = new String[1];
		bsetup.init(blank);
	}

}
