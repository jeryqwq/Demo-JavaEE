package jdbc;

public class Account {

	private Integer id;
	private String username;
	private Double balance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void username(String username) {
		this.username = username;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public  Account(String username,Double balance){
		this.username=username;
		this.balance=balance;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ÐÕÃû"+this.getUsername()+"ÕË»§½ð¶î"+this.getBalance();
	}
	
	
}
