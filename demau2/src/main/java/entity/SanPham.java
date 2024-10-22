package entity;

public class SanPham {
	private int id;
	private String ma;
	private String ten;
	private int soLuong;
	private int trangThai;

	public SanPham() {
		super();
	}

	public SanPham(int id, String ma, String ten, int soLuong, int trangThai) {
		super();
		this.id = id;
		this.ma = ma;
		this.ten = ten;
		this.soLuong = soLuong;
		this.trangThai = trangThai;
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

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

}
