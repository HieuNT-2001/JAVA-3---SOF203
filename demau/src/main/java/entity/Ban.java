package entity;

public class Ban {

	private int id;
	private String ma;
	private String ten;
	private String soThich;
	private int gioiTinh;

	public Ban() {
		super();
	}

	public Ban(int id, String ma, String ten, String soThich, int gioiTinh) {
		super();
		this.id = id;
		this.ma = ma;
		this.ten = ten;
		this.soThich = soThich;
		this.gioiTinh = gioiTinh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSoThich() {
		return soThich;
	}

	public void setSoThich(String soThich) {
		this.soThich = soThich;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

}
