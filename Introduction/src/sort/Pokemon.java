package sort;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;

	public Pokemon(String name, int lvl){
		hp = 100;
		this.name = name;
		this.level = level;
		this.poisoned = false;
	} 
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < 0.9){
			attack.attack(target);
			System.out.println("The attack hit");
		}
		else{
			System.out.println("The attack missed");
		}
	}
	
	public void iChooseYou(){
		System.out.println(this.name);
	}
	
	public int getHP(){
		return hp;
	
	}
	
	public String getName(){
		return name;
	}
	
	public void setHP(int newHP){
		hp = newHP;
	}
	
	public void setPoisoned(boolean b){
		poisoned = b;
	}
	
	public void lapse(){
		if(poisoned){
			this.hp = hp - 15;
		}
	}
}
