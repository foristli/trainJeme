package org.train;

import com.opensymphony.xwork2.ActionSupport;

public class LoginStrut extends ActionSupport {
	
	private User user;

	@Override
	public String execute()
	{
		System.out.println(user.toString());
		try
		{
			DBOperation db=new DBOperation();
			db.addUser(this.user);
		}
		catch(Exception e)
		{
			return this.ERROR;
		}
		return this.SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
