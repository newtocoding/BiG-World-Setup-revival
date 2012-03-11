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
 * @author William Immendorf
 *
 * Mod Class, a basic Javabean that holds all mod details.
 */
public class Mod {
	
	// Values
	String name; // Long name
	String sname; // Short name
	String md5; // MD5sum
	String dlocation; // Download location
	String home; // Home page
	String description; // Description
	String wnotes; // Notes from - guess who.
	Double size; // Size, in MB
	ModGroup mg; // Mod group - is an enum
	String version; // Mod version

	public Mod(String name, String sname, String md5, String dlocation,
			String home, String description, String wnotes, Double size,
			ModGroup mg, String version) {
		this.name = name;
		this.sname = sname;
		this.md5 = md5;
		this.dlocation = dlocation;
		this.home = home;
		this.description = description;
		this.wnotes = wnotes;
		this.size = size;
		this.mg = mg;
		this.version = version;
	}
	
	public Mod(String name, String sname, String md5, String dlocation,
			String home, String description, String wnotes, Double size,
			String mg, String version) {
		this.name = name;
		this.sname = sname;
		this.md5 = md5;
		this.dlocation = dlocation;
		this.home = home;
		this.description = description;
		this.wnotes = wnotes;
		this.size = size;
		this.mg = ModGroup.valueOf(mg);
		this.version = version;
	}
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Mod() { }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSName() {
		return sname;
	}

	public void setSName(String sname) {
		this.sname = sname;
	}

	public String getMD5() {
		return md5;
	}

	public void setMD5(String md5) {
		this.md5 = md5;
	}

	public String getDownloadLoc() {
		return dlocation;
	}

	public void setDownloadLoc(String dlocation) {
		this.dlocation = dlocation;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWilliamNotes() {
		return wnotes;
	}

	public void setWilliamNotes(String wnotes) {
		this.wnotes = wnotes;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public ModGroup getModGroup() {
		return mg;
	}

	public void setModGroup(ModGroup mg) {
		this.mg = mg;
	}
	
	public void setModGroup(String modValue) {
		this.mg = ModGroup.valueOf(modValue);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Mod) {
			Mod mod = (Mod)obj;
			if (mod.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	
}
