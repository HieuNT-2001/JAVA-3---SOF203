package entity;

public class UserEntity {
	
	private String username = "admin";
	private String password = "123";
	private String name = "lam";
	private int phone = 123456789;
	
	public UserEntity() {
	}

	public UserEntity(String username, String password, String name, int phone) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}