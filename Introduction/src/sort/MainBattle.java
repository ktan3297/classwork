//anonymous inner type: implementation of an interface written into a parameter 
//put something in but didn't keep track of it 

package sort;

public class MainBattle {
	
	public static void main(String[] args) {
		Pokemon raticate = new Pokemon("Raticate", 26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur", 26);
		raticate.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Raticate is preparing to attack with super fang");
		raticate.attack(bulbasaur, new Attack() {
			
			@Override //implementation of the interface
			public void attack(Pokemon target) {
				System.out.println("Super fang is used");
				int newHP = target.getHP()/2;
				target.setHP(newHP);
			}
		});
		bulbasaur.attack(raticate, new Attack() {
			
			@Override
			public void attack(Pokemon target) {
				System.out.println("Poison power is used");
				target.setPoisoned(true);
			}
		});
		
		raticate.lapse();
		bulbasaur.lapse(); 
		printScore(raticate, bulbasaur);
	}

	private static void printScore(Pokemon p1, Pokemon p2) {
		System.out.println(p1.getName()+ ", hp = " + p1.getHP());
		System.out.println(p2.getName()+ ", hp = " + p2.getHP());
		
	}
 
}
 