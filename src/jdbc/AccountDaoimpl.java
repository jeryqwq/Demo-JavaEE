package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoimpl implements AccountDao {

	private JdbcTemplate jdbctemplate;
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	@Override
	public int addAccount(Account account) {
		
		String sql="insert into account(username,balance) value(?,?)";
		Object[] obj=new Object[]{
				account.getUsername(),
				account.getBalance()
		};
	int num=this.jdbctemplate.update(sql,obj);
	
		return num;
	}

	@Override
	public int updataAccount(Account account) {
		
		String sql="update account set username=?,balance=? where id=?";
		Object[] obj=new Object[]{
				account.getUsername(),
				account.getBalance(),
				account.getId()
		};
	int num=this.jdbctemplate.update(sql,obj);
	
		return num;
	}

	@Override
	public int deleteAccount( int id) {
	String sql="delete from account where id=?";
	int num=this.jdbctemplate.update(sql,id);
	return num;
	}



}
