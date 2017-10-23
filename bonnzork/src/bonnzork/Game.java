package bonnzork;

import java.util.ArrayList;

public class Game {
	static ArrayList inventory = new ArrayList();
	static String input = Input.getInput();
	//static String input = Input.getInput();
	
	//private static ArrayList<String> tory = Inven.gettory2();
	static Rooms currentlocation;
	public static void main(String[] args) {
		//boolean testroom;
		boolean isPlaying = true;
		
		ArrayList<String> inventory = new ArrayList<String>();
		
		Items Knife = new Items("Knife", "There is a knife standing upright in the ground", "The knife blade is made of steel, and is pockmarked from oxidation from the dried blood, and the handle is covered in blood.");
	Rooms livingroom = new Rooms("Living Room","There is a couch and a rug.");
	Rooms studyroom = new Rooms("The Study", "There is a computer and a bookshelf");
	
				currentlocation=livingroom;
				
				inventory.add(Knife.getItemName());
				if (input.toLowerCase().equals("start")) {
					
					System.out.println(currentlocation.getRoomName()+"\n"+currentlocation.getRoomdesc());
				}
				
				
				if (input.toLowerCase().equals("left")) {
					currentlocation=studyroom;
					System.out.println(currentlocation.getRoomName()+"\n"+currentlocation.getRoomdesc());
				}
				
					
					if (input.toLowerCase().equals("inventory")) {
					for(int i=0; i<inventory.size(); i++) {
					String iteminv =   inventory.get(i);
					System.out.println(iteminv);
					}
					if(inventory.isEmpty()) {
						System.out.println("You have nothing.");
					}
					else {System.out.println(" ");
					
					}
					
					}
					
					while (isPlaying) {
						
						
						}
				}
	
					 
			
	

	public ArrayList  getInventory() {
		return (ArrayList) inventory.clone();
	}
	
	

}
