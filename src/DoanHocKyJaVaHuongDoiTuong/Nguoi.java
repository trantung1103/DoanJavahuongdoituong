package DoanHocKyJaVaHuongDoiTuong;

public class Nguoi {
	private String HoTen;
	private int tuoi;
	private String gioitinh;
	private String DiaChi;
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public Nguoi(String hoTen, int tuoi, String gioitinh, String diaChi) {
		super();
		HoTen = hoTen;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		DiaChi = diaChi;
	}
	public Nguoi() {
		super();
	}
	
}
