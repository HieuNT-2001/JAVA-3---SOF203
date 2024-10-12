package entity;

public class Ban {

	private int id;
	private String name;
	private String hobby;
	private boolean gender;

	public Ban() {
		super();
	}

	public Ban(int id, String name, String hobby, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.hobby = hobby;
		this.gender = gender;
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

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
