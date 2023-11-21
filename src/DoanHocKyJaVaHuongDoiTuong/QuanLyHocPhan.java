package DoanHocKyJaVaHuongDoiTuong;

import java.util.*;



public class QuanLyHocPhan {
	public ArrayList<HocPhan> DSHP=new ArrayList<HocPhan>();
	FileHocPhan obj=new FileHocPhan();
	Scanner sc=new Scanner(System.in);
	public void NhapHocPhan()
	{
		 try {
	            System.out.print("Nhap so luong hoc phan: ");
	            int slhp = sc.nextInt();
	            sc.nextLine();
	            for (int i = 0; i < slhp; i++) {
	                System.out.print("Nhap ma hoc phan: ");
	                String maHp = sc.nextLine();
	                System.out.print("Nhap ten hoc phan: ");
	                String tenHp = sc.nextLine();
	                System.out.print("Nhap so tin chi: ");
	                int soTc = sc.nextInt();
	                sc.nextLine();
	                System.out.print("Nhap hoc ky cua hoc phan: ");
	                String hocKy = sc.nextLine();
	                System.out.print("Hoc phan cua khoa: ");
	                String khoa = sc.nextLine();
	                HocPhan hp = new HocPhan(soTc, maHp, tenHp, hocKy, khoa);
	                DSHP.add(hp);
	            }
	            obj.ghiFile(DSHP);
	            System.out.println("Nhap file thanh cong");
	        } catch (Exception e) {
	            System.out.println("Nhap hoc phan bi loi! ");
	        }
	    }
	public void docFile() 
	{
		DSHP= obj.docFile("e:\\hocphan.bin");
	}
	public void HienThi() {
	    System.out.println("===================================================================");
	    System.out.printf("| %-10s | %-20s | %-8s | %-12s | %-10s |\n",
	            "Ma HP", "Ten HP", "So TC", "Hoc Ky", "Khoa");
	    System.out.println("===================================================================");

	    for (HocPhan hp : DSHP) {
	        System.out.printf("| %-10s | %-20s | %-8d | %-12s | %-10s |\n",
	                hp.getMaHp(), hp.getTenHp(), hp.getSoTc(), hp.getHocKy(), hp.getKhoa());
	    }

	    System.out.println("===================================================================");
	}
	public void chen(HocPhan obj, int vt) {
		DSHP.add(vt, obj);
		
	}

	public void xoa(String tenHp) {
		for (int i = 0; i < DSHP.size(); i++) {
			if (DSHP.get(i).getTenHp().equals(tenHp) == true)
				DSHP.remove(i);
		}
	}
	public void SapXepTheoTenHocKy() {
	    Collections.sort(DSHP, new Comparator<HocPhan>() {
	        @Override
	        public int compare(HocPhan hp1, HocPhan hp2) {
	            return hp1.getHocKy().compareToIgnoreCase(hp2.getHocKy());
	        }
	    });
	}
}
