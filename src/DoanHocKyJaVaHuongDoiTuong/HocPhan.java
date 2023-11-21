package DoanHocKyJaVaHuongDoiTuong;


import java.io.*;
import java.util.*;

public class HocPhan implements Serializable {
	private int soTc;
	private String maHp;
	private String tenHp;
	private String HocKy;
	private String Khoa;
	public int getSoTc() {
		return soTc;
	}
	public void setSoTc(int soTc) {
		this.soTc = soTc;
	}
	public String getMaHp() {
		return maHp;
	}
	public void setMaHp(String maHp) {
		this.maHp = maHp;
	}
	public String getTenHp() {
		return tenHp;
	}
	public void setTenHp(String tenHp) {
		this.tenHp = tenHp;
	}
	public String getHocKy() {
		return HocKy;
	}
	public void setHocKy(String hocKy) {
		HocKy = hocKy;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public HocPhan(int soTc, String maHp, String tenHp, String hocKy, String khoa) {
		super();
		this.soTc = soTc;
		this.maHp = maHp;
		this.tenHp = tenHp;
		HocKy = hocKy;
		Khoa = khoa;
	}
	public HocPhan() {
		super();
	}
	public void ghiFile(ArrayList<HocPhan> HocPhanList) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        try {

 

            fout = new FileOutputStream("e:\\hocphan.bin");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(HocPhanList);

 

            System.out.println("Xong rồi!");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

 

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
