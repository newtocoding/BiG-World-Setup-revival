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
package imm.william.bigworldsetup;

/**
 * @author William Imm
 *
 *	What catagory this mod is in.
 */
public enum ModGroup {
	Essentals("Essental Files"),
	Corrections("Corrections"),
	Improvements("Improvements"),
	BG2MegaMods("BG2 Mega Mods"),
	BGT("Baldur's Gate Trilogy"),
	BG1MegaMods("BG1 Mega Mods"),
	BG1Quest("BG1 Quest Mods"),
	BG1Stores("BG1 Stores and Items"),
	BG1NPC("BG1 NPC Mods"),
	BG1RulesTweaks("BG1 Rules & Tweaks"),
	BG2QuestMods("BG2 Quest Mods"),
	BG2Tatical("BG2 Tactical Mods"),
	BG2Stores("BG2 Stores and Items"),
	BG2NPC("BG2 NPC Mods"),
	BG21Day("BG2 1-day NPCs"),
	BG2BioNPC("BG2 Bioware NPC Additions"),
	BG2Mini("BG2 Mini Mods"),
	BG2RulesTweaks("BG2 Rules & Tweaks"),
	KitsHla("Kits and HLA Mods"),
	Graphics("Graphic and Portait Mods");
	
	private String longName;
	
	ModGroup(String name) {
		this.longName = name;
	}
	
	public String getLongName() {
		return longName;
	}
}
