package DoanHocKyJaVaHuongDoiTuong;

import java.util.Scanner;



public class main {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu=new Menu();
		Scanner sc=new Scanner(System.in);
		int chon;
		do {
			System.out.println("1.Quản lý sinh vien");
			System.out.println("2.Quản lý học phần");
			System.out.println("3.Quản lý giản viên");
			System.out.println("Moi Ban Chon");
			chon=sc.nextInt();
			switch(chon)
			{
			case 1: {menu.menuSv();break;}
			case 2: {menu.menuHp();break;}
			case 3: {menu.menuGV();break;}
			default : break;
			}
		}while(chon<=3);
	}
}
