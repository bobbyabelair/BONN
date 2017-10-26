package bonnzork;

import java.util.ArrayList;

public class Items {
	String itemName;
	String groundDesc;
	String invDesc;
	
	
public Items() {
	itemName = new String();
	groundDesc = new String();
	invDesc = new String();
}
public Items(String name) {
	this.itemName = name;
	this.groundDesc = new String();
	this.invDesc = new String();
}
public Items(String name, String ground) {
	itemName = name;
	groundDesc = ground;
	invDesc = new String();
}
public Items(String name, String ground, String in) {
	itemName = name;
	groundDesc = ground;
	invDesc = in;
}

public void setItemName (String name) {
	this.itemName = name;
}

public void setGrounddes(String desc) {
	this.groundDesc = desc;
}
public void setinvDesc(String desc) {
	this.invDesc = desc;
}
public String getItemName () {
	return itemName;
}
public String getGrounddes() {
	return groundDesc;
}
public String getinvDesc() {
	return invDesc;
}
public void addItemtoInventory(String name) {
	 Game.inventory.add(name);
}
public void removeItemtoInventory(Items name) {
	 Game.inventory.remove(name);
}
}
