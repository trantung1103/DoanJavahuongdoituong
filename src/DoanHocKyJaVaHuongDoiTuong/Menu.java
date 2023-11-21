package DoanHocKyJaVaHuongDoiTuong;

import java.util.Scanner;
public class Menu {
	QuanLySinhVien svobj  =new QuanLySinhVien();
	QuanLyHocPhan hpobj=new QuanLyHocPhan();
	QuanLyGiangVien gvobj=new QuanLyGiangVien();
	Scanner           sc  =new Scanner(System.in);
	public void menuSv()
	{
		int c3;
		do {
			System.out.println("|****************QUAN LY SINH VIEN*******************|");
			System.out.println("|***************1. Nhap Sinh vien********************|");
			System.out.println("|**************2. Hien thi sinh vien*****************|");
			System.out.println("|***************3. Them Sinh Viên********************|");
			System.out.println("|**************4. Xoa SV theo Ma Sv******************|");
			System.out.println("|*5. Hien thi nhung sinh vien co diem thi lon hon 5:*|");
			System.out.println("|*****6. Sap xep diem thi sinh vien giam dan*********|");		
			System.out.println("*****************************************************|");
			System.out.println("Mời bạn chọn: ");
			c3=sc.nextInt();
			sc.nextLine();
			switch(c3)
			{
			case 1: {svobj.Nhap();break;}
			case 2: {svobj.hienthi();break;}
			case 3: 
			{
				 System.out.print("Nhap Ma Sinh Vien:");
				 String maSV= sc.nextLine();
				 System.out.print("Nhap Ho Ten Sinh Vien:");
				 String HoVaTen=sc.nextLine();
				 System.out.print("Nhap Tuoi:");
				 int tuoi=sc.nextInt();
				 sc.nextLine();
				 System.out.print("Nhap Gioi Tinh:");
				 String gioitinh=sc.nextLine();
				 System.out.print("Nhap Dia Chi:");
				 String DiaChi= sc.nextLine();
				 System.out.print("Sinh Vien Thuoc Khoa:");
				 String Khoa=sc.nextLine();
				 System.out.print("Nhap Diem Qua Trinh:");
				 float DiemQuaTrinh =sc.nextFloat();
				 System.out.print("Nhap Diem Thi:");
				 float DiemThi=sc.nextFloat();
				 SinhVien sv=new SinhVien(maSV,HoVaTen,tuoi,gioitinh,DiaChi,Khoa,DiemQuaTrinh,DiemThi);
				 System.out.print("Nhap vi tri can chen:");
				 int vt=sc.nextInt();
				 svobj.chen(vt, sv);
				 svobj.hienthi();
				 break;
			}
			case 4: 
			{
				System.out.print("Nhap ma cua sinh vien can xoa:");
				String maSV=sc.nextLine();
				svobj.xoa(maSV);
				break;
				}
			case 5: {svobj.hienthi5();break;}
			case 6: 
			{
				svobj.SapXepTheoDiem();
				svobj.hienthi();
				break;
			}
			
			
}
		}while (c3<7);
	}
	public void menuHp()
	{
		int c2;
		do {
			System.out.println("|****************QUAN LY HỌC PHẦN*******************|");
			System.out.println("|****************1. Nhap Hoc Phan*******************|");
			System.out.println("|**************2. Hien thi Hoc phan*****************| ");
			System.out.println("|****************3. Them hoc phan*******************|");
			System.out.println("|*****************4. Xoa hoc phan*******************|");
			System.out.println("|***********5. Sap xep ten hoc phan tang dan********| ");
			System.out.println("|*******************6. Doc file*********************|");
			System.out.println("|***************************************************| ");
			System.out.println("Mời bạn chọn: ");
			c2=sc.nextInt();
			sc.nextLine();
			switch(c2)
			{
			case 1: {hpobj.NhapHocPhan();break;}
			case 2: {hpobj.HienThi();break;}
			case 3: 
			{
				System.out.print("Nhap ma hoc phan:");
				String maHp=sc.nextLine();
				System.out.print("Nhap ten hoc phan:");
				String tenHp=sc.nextLine();
				System.out.print("Nhap so tin chi:");
				int soTc=sc.nextInt();
				sc.nextLine();
				System.out.print("Nhap hoc ky cua hoc phan:");
				String HocKy=sc.nextLine();
				System.out.print("Hoc phan cua khoa:");
				String Khoa=sc.nextLine();
				HocPhan hp=new HocPhan(soTc,maHp,tenHp,HocKy,Khoa);
				System.out.print("Nhap vi tri can chen:");
				int vt=sc.nextInt();
				hpobj.chen(hp, vt);
				hpobj.HienThi();
			}
			case 4: 
			{
				System.out.print("Nhap ten cua hoc phan can xoa:");
				String tenHp=sc.nextLine();
				hpobj.xoa(tenHp);
				hpobj.HienThi();
				
				break;
			}
			case 5:
			{
				hpobj.SapXepTheoTenHocKy();
				hpobj.HienThi();
				break;
			}
			
			case 6:
			{
				hpobj.docFile();
				break;
			}
}
		}while (c2<7);
	}
	public void menuGV()
	{
		int c3;
		do {
			System.out.println("|****************QUAN LY GIẢNG VIÊN*******************|");
			System.out.println("|****************1. Nhap giang vien*******************| ");
			System.out.println("|**************2. Hien thi giang vien*****************| ");
			System.out.println("|****************3. Them giang vien*******************|");
			System.out.println("*****************4. Xoa gv theo ten*******************|");
			System.out.println("|********5. Sap xep ten gian vien thu tu tang dan*****| ");		
			System.out.println("|*****************************************************| ");
			System.out.println("Mời bạn chọn: ");
			c3=sc.nextInt();
			sc.nextLine();
			switch(c3)
			{
			case 1: {gvobj.NhapGv();break;}
			case 2: {gvobj.hienthigv();break;}
			case 3: 
			{
				System.out.print("Nhap Ma giang vien:");
				String maGv = sc.nextLine();
				System.out.print("Nhap Ho ten giang vien:");
				String Hoten =sc.nextLine();
				System.out.print("Nhap tuoi:");
				int Tuoi =sc.nextInt();
				System.out.print("Nhap gioi tinh:");
				String GioiTinh = sc.nextLine();
				String DiaChi =sc.nextLine();
				System.out.print("Giang vien thuoc khoa:");
				String Khoa =sc.nextLine();
				GiangVien gv=new GiangVien(maGv,Tuoi,Hoten,GioiTinh,DiaChi,Khoa);
				 System.out.print("Nhap vi tri can chen:");
				 int vt=sc.nextInt();
				 gvobj.chen(vt, gv);
				 gvobj.hienthigv();
				 break;
			}
			case 4: 
			{
				System.out.print("Nhap ten cua Giang vien can xoa:");
				String Hoten=sc.nextLine();
				gvobj.xoa(Hoten);
				break;
				}
			case 5: 
			{
				gvobj.SapXepTheoTen();
				gvobj.hienthigv();
				break;
			}
			
			
}
		}while (c3<7);
	}
}
