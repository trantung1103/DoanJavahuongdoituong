package DoanHocKyJaVaHuongDoiTuong;

public class SinhVien extends Nguoi{
	private String maSV;
	private String Khoa;
	private float DiemQuaTrinh,DiemThi;
	private String KetQua, XepLoai;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public float getDiemQuaTrinh() {
		return DiemQuaTrinh;
	}
	public void setDiemQuaTrinh(float diemQuaTrinh) {
		DiemQuaTrinh = diemQuaTrinh;
	}
	public float getDiemThi() {
		return DiemThi;
	}
	public void setDiemThi(float diemThi) {
		DiemThi = diemThi;
	}
	
	public String getKetQua() {
		return KetQua;
	}
	public void setKetQua(String ketQua) {
		KetQua = ketQua;
	}
	public String getXepLoai() {
		return XepLoai;
	}
	public void setXepLoai(String xepLoai) {
		XepLoai = xepLoai;
	}
	public SinhVien(String maSV,String hoTen, int tuoi,String gioitinh, String diaChi,  String khoa,
			float diemQuaTrinh, float diemThi) {
		super(hoTen, tuoi, gioitinh, diaChi);
		this.maSV = maSV;
		Khoa = khoa;
		DiemQuaTrinh = diemQuaTrinh;
		DiemThi = diemThi;
	}
	public SinhVien(String hoTen, int tuoi, String gioitinh, String diaChi) {
		super(hoTen, tuoi, gioitinh, diaChi);
	}

}
	
	
