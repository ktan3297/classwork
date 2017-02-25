package blackjack;

import java.util.ArrayList;

public interface CallInterface {
	
	public void hit();
	public int checkValue();
	public boolean stand();
	public boolean getStandCall();
	public void setStandCall();
	public int getTotal();
	public void setTotal();
}
 