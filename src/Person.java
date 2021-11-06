import java.util.*;

public class Person implements Tempelate{
	
	Date date1 = new Date();
	
	private String userName="osamah" ; 
	private String password ="1111";
	private long balance ; 
	private boolean state  ; 
	private String date  ; 
	private long withdraw  ;
	private long creditCard;
	
	 public Person() {
		 balance=0 ; 
		 state=false ; 
		 date=date1.toString();
		 withdraw=2000 ; 
		 creditCard=10000 ; 
		
	}

	@Override
	public String getUserName() {
		
		return this.userName;
	}

	@Override
	public String getPassword() {
		
		return this.password;
	}

	@Override
	public void setBalance(long balance) {
		
		
		
	}

	@Override
	public long getBalance() {
		
		return this.balance;
	}

	@Override
	public void setState() {
		if(this.balance<0)
			this.state=true ; 
		else
			this.state=false ; 
		
	}

	@Override
	public boolean getState() {
		
		return this.state;
	}

	@Override
	public void setDate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setWithdraw(long whithdraw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getWithdraw() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCreditCard(long creditCard) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getCreditCard() {
		// TODO Auto-generated method stub
		return 0;
	}

}
