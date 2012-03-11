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

import org.xml.sax.helpers.DefaultHandler;

import java.io.*;
import java.util.*;
import javax.xml.parsers.*;
import org.xml.sax.*;

/**
 * @author William Immendorf
 *
 *
 * A simple link list parser that gives a arraylist of mods - for use later.
 */
public class LinkListParser extends DefaultHandler {
	ArrayList<Mod> modList;
	
	private String tempValue;
	
	// for context
	private Mod tempMod;
	
	public LinkListParser() {
		super();
		modList = new ArrayList<Mod>();
	}
	
	// what do you think it does?
	public ArrayList<Mod> getModList(File linklist) {
		parseLinkList(linklist);
		return modList;
	}
	
	// Sets up the SAX parser, and make it parse away
	public void parseLinkList(File linklist) {
		// get the pasta - sorry, parser factory
		SAXParserFactory pastaFactory = SAXParserFactory.newInstance();
		try {
			// get the parser itself
			SAXParser parser = pastaFactory.newSAXParser();
			
			// and parse away
			parser.parse(linklist, this);
		}
		// general SAX errors
		catch (SAXException se) {
			System.out.println("An error occured when processing the link list.");
			se.printStackTrace();
		}
		// parser configuration error - this should not happen
		catch (ParserConfigurationException pce) {
			System.out.println("The SAX parser had been configured incorrectly - this should not happen.");
			pce.printStackTrace();
		}
		// IO errors
		catch (IOException ie) {
			System.out.println("An error occured when attempting to open the linklist.");
			ie.printStackTrace();
		}
	}
	
	// Event handlers
	// Start of a element
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// reset temporary value for each mod
		tempValue = "";
		if (qName.equalsIgnoreCase("Mod")) {
			tempMod = new Mod();
		}
	}
	
	// The meat of a element
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		tempValue = new String(ch,start,length);
	}
	
	// And the end, my friends.
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch (qName.toLowerCase()) { //no case issues here
		case "mod": modList.add(tempMod); break;
		case "name": tempMod.setName(tempValue); break;
		case "shortname": tempMod.setSName(tempValue); break;
		case "md5sum": tempMod.setMD5(tempValue); break;
		case "download": tempMod.setDownloadLoc(tempValue); break;
		case "home": tempMod.setHome(tempValue); break;
		case "description": tempMod.setDescription(tempValue); break;
		case "williamsnotes": tempMod.setWilliamNotes(tempValue); break;
		case "size": tempMod.setSize(Double.parseDouble(tempValue)); break;
		case "modgroup": tempMod.setModGroup(ModGroup.valueOf(tempValue)); break;
		case "version": tempMod.setVersion(tempValue);
		}
	}
	
}
