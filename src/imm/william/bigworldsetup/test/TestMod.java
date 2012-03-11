/*     This file is part of the BiG World Setup Revival.

    The BiG World Setup is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    The setup is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with the setup.  If not, see <http://www.gnu.org/licenses/>. */

/**
 * 
 */
package imm.william.bigworldsetup.test;

import static org.junit.Assert.*;

import imm.william.bigworldsetup.*;
import org.junit.*;

/**
 * @author William Imm
 *
 *	Testcase for the Mod Class
 */
public class TestMod {

	@Test
	public void testSampleMod() {
		// This will basically create a sample mod - in this case, the
		// Freedom's Reign/Reign of Virtue mini-mod.
		
		String name = "Freedom's Reign & Reign of Virtue";
		String sname = "FR/ROV";
		String md5 = "39ca3b2ae20a840a64415bf2e23b0db4";
		String dlocation = "http://www.shsforums.net/files/download/121-freedoms-reign-reign-of-virtue/";
		String home = "http://www.shsforums.net/index.php?autocom=downloads&showfile=121";
		String description = "A minimod that adds new stores, items, and encounters throughout BG2.";
		String wnotes = "This mod is great.";
		
		double size = 896.29;
		ModGroup mg = ModGroup.BG2Stores;
		
		Mod m = new Mod(name, sname, md5, dlocation, home, description, wnotes, size, mg);
		
		// Make sure everything is equal and set:
		
		assertEquals(m.getName(), name);
		assertEquals(m.getSName(), sname);
		assertEquals(m.getMD5(), md5);
		assertEquals(m.getDownloadLoc(), dlocation);
		assertEquals(m.getHome(), home);
		assertEquals(m.getDescription(), description);
		assertEquals(m.getWilliamNotes(), wnotes);
		assertEquals(m.getSize(), size, 0);
		assertEquals(m.getModGroup(), mg);
		
		// Now change the values:
		
		m.setName("Reign of Terror");
		m.setSName("ROT");
		m.setMD5("nobody cares");
		m.setDownloadLoc("it's a secret to everybody");
		m.setHome("around the universe");
		m.setDescription("Yet another Drizzt mod - it sucks.");
		m.setWilliamNotes("Need I say more?");
		m.setSize(12120.21);
		m.setModGroup(ModGroup.BG2MegaMods);
		
		// Again, equality checks:
		
		assertEquals(m.getName(), "Reign of Terror");
		assertEquals(m.getSName(), "ROT");
		assertEquals(m.getMD5(), "nobody cares");
		assertEquals(m.getDownloadLoc(), "it's a secret to everybody");
		assertEquals(m.getHome(), "around the universe");
		assertEquals(m.getDescription(), "Yet another Drizzt mod - it sucks.");
		assertEquals(m.getWilliamNotes(), "Need I say more?");
		assertEquals(m.getSize(), 12120.21, 0);
		assertEquals(m.getModGroup(), ModGroup.BG2MegaMods);
		
	}

}
