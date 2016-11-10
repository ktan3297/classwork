package caveExplorer;

public class Inventory {
	
	public boolean hasMap;
	public String map;
	
	public Inventory(){
		hasMap = false;
		updateMap();
	}

	public void updateMap() {
		map = " ";
		for(int i = 0; i < CaveExplorer.caves[0].length - 1; i++){
			map += "____";
		}
		map += "___\n";
		for(CaveRoom[] row: CaveExplorer.caves){
			//three rows of text
			for(int i = 0; i < 3; i++){
				//a line of text for each 
				String text = "";
				for(CaveRoom cr: row){
					if(cr.getDoor(CaveRoom.WEST) != null && cr.getDoor(CaveRoom.WEST).isOpen()){
						text += " ";
					}
					else{
						text += "|";
					}
					if(i == 0){
						text += "   ";
					}
					else if(i == 1){
						text += " " + cr.getContents() + " ";
					}
					else if(i == 2){
						if(cr.getDoor(CaveRoom.SOUTH) != null && cr.getDoor(CaveRoom.SOUTH).isOpen()){
							text += "   ";
						}
						else{
							text += "___";
						}
					}
				}//last caveroom in the row
				text += "|";
				map += text + "\n";
			}//last of the 3 text lines
		}//last row
	}
	
	public String getDescription(){
		if(hasMap){
			return map;
		}
		else{
			return "There is nothing in your inventory";
		}
	}
	
	public void setMap(boolean b){
		hasMap = b;
	}
}
