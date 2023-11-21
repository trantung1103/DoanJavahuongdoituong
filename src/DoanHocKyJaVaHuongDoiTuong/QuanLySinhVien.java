package DoanHocKyJaVaHuongDoiTuong;
import java.util.*;
public class QuanLySinhVien {
	public ArrayList<SinhVien> DSSV = new ArrayList<SinhVien>();
	Scanner sc=new Scanner(System.in);
	
	 public void Nhap() {
		 try {
		        System.out.print("Nhap So Luong Sinh Vien:");
		        int slsv = sc.nextInt();
		        sc.nextLine();
		        
		        Set<String> maSVSet = new HashSet<>(); // Lưu trữ các mã sinh viên đã nhập
		        
		        for (int i = 0; i < slsv; i++) {
		            System.out.print("Nhap Ma Sinh Vien " + (i + 1) + ":");
		            String maSV = sc.nextLine();
		            
		            // Kiểm tra trùng mã sinh viên
		            if (maSVSet.contains(maSV)) {
		                System.out.println("Loi: Ma sinh vien da ton tai!");
		                i--; // Quay lại nhập lại mã sinh viên
		                continue;
		            }
		            
		            // Các thông tin sinh viên khác
		            System.out.print("Nhap Ho Ten Sinh Vien:");
		            String HoVaTen = sc.nextLine();
		            System.out.print("Nhap Tuoi:");
		            int tuoi = sc.nextInt();
		            sc.nextLine();
		            System.out.print("Nhap Gioi Tinh:");
		            String gioitinh = sc.nextLine();
		            System.out.print("Nhap Dia Chi:");
		            String DiaChi = sc.nextLine();
		            System.out.print("Sinh Vien Thuoc Khoa:");
		            String Khoa = sc.nextLine();
		            System.out.print("Nhap Diem Qua Trinh:");
		            float DiemQuaTrinh = sc.nextFloat();
		            System.out.print("Nhap Diem Thi:");
		            float DiemThi = sc.nextFloat();
		            sc.nextLine();
		            
		            SinhVien sv = new SinhVien(maSV, HoVaTen, tuoi, gioitinh, DiaChi, Khoa, DiemQuaTrinh, DiemThi);
		            DSSV.add(sv);
		            
		            maSVSet.add(maSV); // Thêm mã sinh viên vào set
		        }
		    } catch (InputMismatchException e) {
		        System.out.println("Loi: Nhap sai dinh dang du lieu!");
		    }
  }
	 public void hienthi() {
		    System.out.println("======================================================================================================================================");
		    System.out.printf("| %-10s | %-20s | %-5s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
		            "Ma SV", "Ho va ten", "Tuoi", "Gioi Tinh", "Dia Chi", "Thuoc Khoa", "Diem Qua Trinh", "Diem Thi", "Diem Trung Binh");
		    System.out.println("======================================================================================================================================");

		    for (SinhVien sv : DSSV) {
		        float diemTB = (sv.getDiemQuaTrinh() + sv.getDiemThi()) / 2;
		        System.out.printf("| %-10s | %-20s | %-5d | %-10s | %-10s | %-10s | %-10f | %-10f | %-10f |\n",
		                sv.getMaSV(), sv.getHoTen(), sv.getTuoi(), sv.getGioitinh(), sv.getDiaChi(), sv.getKhoa(),
		                sv.getDiemQuaTrinh(), sv.getDiemThi(), diemTB);
		    }

		    System.out.println("=====================================================================================================================================");
		}	 public void hienthi5()
	 {
			System.out.println("======================================================================================================================================");
		    System.out.printf("| %-10s | %-20s | %-5s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
		            "Ma SV", "Ho va ten", "Tuoi", "Gioi Tinh", "Dia Chi", "Thuoc Khoa", "Diem Qua Trinh", "Diem Thi", "Diem Trung Binh");
		    System.out.println("======================================================================================================================================");

		    for (SinhVien sv : DSSV) {
		    	if(sv.getDiemThi()>5) {
		        float diemTB = (sv.getDiemQuaTrinh() + sv.getDiemThi()) / 2;
		        System.out.printf("| %-10s | %-20s | %-5d | %-10s | %-10s | %-10s | %-10f | %-10f | %-10f |\n",
		                sv.getMaSV(), sv.getHoTen(), sv.getTuoi(), sv.getGioitinh(), sv.getDiaChi(), sv.getKhoa(),
		                sv.getDiemQuaTrinh(), sv.getDiemThi(), diemTB);
		    	}
		    }

		    System.out.println("=====================================================================================================================================");
	 }
		public void chen(int vt, SinhVien obj)
		{
			try {
            DSSV.add(vt, obj);
				} catch (IndexOutOfBoundsException e) {
						System.out.println("Loi: Vi tri chen vuot qua gioi han!");
				}
		}
		public void xoa(String maSV)
		{
			for (int i = 0; i < DSSV.size(); i++) {
				if (DSSV.get(i).getMaSV().equals(maSV)==true)
					DSSV.remove(i);
			}
		}
		public void SapXepTheoDiem() {
			 try {
		            Collections.sort(DSSV, new Comparator<SinhVien>() {
		                @Override
		                public int compare(SinhVien sv1, SinhVien sv2) {
		                    if (sv1.getDiemThi() > sv2.getDiemThi()) {
		                        return -1;
		                    } else if (sv1.getDiemThi() < sv2.getDiemThi()) {
		                        return 1;
		                    } else {
		                        return 0;
		                    }
		                }
		            });
		        } catch (UnsupportedOperationException e) {
		            System.out.println("Loi: Sap xep khong duoc!");
		        }
		}
		
	}
		

