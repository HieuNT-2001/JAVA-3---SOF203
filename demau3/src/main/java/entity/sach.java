package entity;

public class sach {

	private int id;
	private String ma;
	private String ten;
	private int soTrang;
	private float donGia;

	public sach() {
		super();
	}

	public sach(int id, String ma, String ten, int soTrang, float donGia) {
		super();
		this.id = id;
		this.ma = ma;
		this.ten = ten;
		this.soTrang = soTrang;
		this.donGia = donGia;
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

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

}
