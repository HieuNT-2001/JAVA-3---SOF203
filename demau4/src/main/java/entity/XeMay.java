package entity;

public class XeMay {

	private int id;
	private String ma;
	private String ten;
	private int soLuong;
	private String moTa;

	public XeMay() {
		super();
	}

	public XeMay(int id, String ma, String ten, int soLuong, String moTa) {
		super();
		this.id = id;
		this.ma = ma;
		this.ten = ten;
		this.soLuong = soLuong;
		this.moTa = moTa;
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

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

}
