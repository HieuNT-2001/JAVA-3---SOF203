package entity;

public class UserEntity {
	int id, type;
	String name, email;

	public UserEntity(int id, int type, String name, String email) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.email = email;
	}

	public UserEntity() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

}
