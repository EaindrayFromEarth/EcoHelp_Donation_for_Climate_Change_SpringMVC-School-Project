package userAuthentication.models;

import java.io.Serializable;
import java.sql.Date;

public class UserBean  implements Serializable{

	private int id;
	private String name;
	private String email;
	private String password;
	private Date createDate;
	private Date updateDate;
	private String phone;
	private boolean locked;
	private int role;
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	public int getRole() {
		return role;
	}


	public void setRole(int role) {
		this.role = role;
	}

	public boolean getLocked() {
		return locked;
	}


	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public UserBean() {
		
	}

}
