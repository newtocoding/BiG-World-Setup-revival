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
	BG2MegaMods("BG2 Mega Mods"),
	BG2Stores("BG2 Stores and Items");
	
	private String longName;
	
	ModGroup(String name) {
		this.longName = name;
	}
	
	public String getLongName() {
		return longName;
	}
}
