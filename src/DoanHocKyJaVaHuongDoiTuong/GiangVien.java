package DoanHocKyJaVaHuongDoiTuong;

public class GiangVien extends Nguoi{
	private String maGV;
	private String Khoa;
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public GiangVien(String hoTen, int tuoi, String gioitinh, String diaChi, String maGV, String khoa) {
		super(hoTen, tuoi, gioitinh, diaChi);
		this.maGV = maGV;
		Khoa = khoa;
	}
	public GiangVien(String hoTen, int tuoi, String gioitinh, String diaChi) {
		super(hoTen, tuoi, gioitinh, diaChi);
	}
	
}
