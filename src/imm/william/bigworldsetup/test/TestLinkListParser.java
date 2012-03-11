package imm.william.bigworldsetup.test;

import static org.junit.Assert.*;

import org.junit.*;
import imm.william.bigworldsetup.*;
import java.util.ArrayList;
import java.io.File;

public class TestLinkListParser {
	
	ArrayList<Mod> modList;

	@Before
	public void setUp() throws Exception {
		modList = new ArrayList<Mod>();
		// There are two mods in both the local list, and the test file. Both of them have the same mods.
		// The mods that I'm using for an example are Gavin NPC, for both BG1 and BG2.
		modList.add(new Mod("Gavin NPC for Tutu/BGT", "Gavin", "01ed073dc8be870ea30ad3bbcec426d4",
				"http://forums.gibberlings3.net/index.php?app=downloads&module=display&section=download&do=confirm_download&id=714",
				"http://www.gibberlings3.net/gavin/", "Blah blah, very well made NPC, blah blah.",
				"A+! Two thumbs up! Rave reviews!", 4.94, "BG1NPC", "8"));
		modList.add(new Mod("Gavin NPC for BG2", "Gavin BG2", "d50ea8222533d0d1950ce218ebfb9a71", 
				"http://forums.gibberlings3.net/index.php?app=downloads&module=display&section=download&do=confirm_download&id=904",
				"http://www.gibberlings3.net/gavin_bg2/index.php", "Blah blah, very well made NPC, blah blah, returns for more, blah blah.",
				"See my opinion on Gavin NPC.", 8.6, "BG2NPC", "TOB beta 20111125"));
	}

	@Test
	public void testParseModList() {
		LinkListParser parser = new LinkListParser();
		ArrayList<Mod> testList = parser.getModList(new File("testfiles/testlist.xml"));
		assertEquals(testList, modList);
	}

}
