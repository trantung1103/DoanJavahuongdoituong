package DoanHocKyJaVaHuongDoiTuong;

import java.util.*;

public class QuanLyGiangVien {
	public ArrayList<GiangVien> DSGV=new ArrayList<GiangVien>();
	Scanner sc = new Scanner(System.in);
	public void NhapGv()
	{
		System.out.print("Nhap so luong giang vien");
		int slgv = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<slgv;i++);
		{
			System.out.print("Nhap Ma giang vien");
			String maGv = sc.nextLine();
			System.out.print("Nhap Ho ten giang vien");
			String Hoten =sc.nextLine();
			System.out.print("Nhap tuoi");
			int Tuoi =sc.nextInt();
			sc.nextLine();
			System.out.print("Nhap gioi tinh");
			String GioiTinh = sc.nextLine();
			System.out.print("Nhap dia chi");
			String DiaChi =sc.nextLine();
			System.out.print("Giang vien thuoc khoa");
			String Khoa =sc.nextLine();
			GiangVien gv=new GiangVien(maGv,Tuoi,Hoten,GioiTinh,DiaChi,Khoa);
			DSGV.add(gv);
			
		}
		
	}
	public void hienthigv() {
	    System.out.println("================================================================================================");
	    System.out.printf("| %-10s | %-20s | %-5s | %-10s | %-30s | %-15s |\n",
	            "Ma GV", "Ho va ten", "Tuoi", "Gioi Tinh", "Dia Chi", "Khoa");
	    System.out.println("================================================================================================");

	    for (GiangVien gv : DSGV) {
	        System.out.printf("| %-10s | %-20s | %-5d | %-10s | %-30s | %-15s |\n",
	                gv.getMaGV(), gv.getHoTen(), gv.getTuoi(), gv.getGioitinh(), gv.getDiaChi(), gv.getKhoa());
	    }

	    System.out.println("================================================================================================");
	}
	public void chen(int vt, GiangVien obj)
	{
		try {
        DSGV.add(vt, obj);
			} catch (IndexOutOfBoundsException e) {
					System.out.println("Loi: Vi tri chen vuot qua gioi han !");
			}
	}
	public void xoa(String Hoten)
	{
		for (int i = 0; i < DSGV.size(); i++) {
			if (DSGV.get(i).getMaGV().equals(Hoten)==true)
				DSGV.remove(i);
		}
	}
	public void SapXepTheoTen() {
	    Collections.sort(DSGV, new Comparator<GiangVien>() {
	        @Override
	        public int compare(GiangVien gv1, GiangVien gv2) {
	            return gv1.getHoTen().compareToIgnoreCase(gv2.getHoTen());
	        }
	    });
	}
}
