package may26_20094511_TranNguyenMinhKhoi;

import java.util.Scanner;

public class TestHinhTron {
	//in tieu de
	public static void inTieuDe() {
//		for (int i = 0; i < 44; i++) {
//			System.out.printf("-");
//		}
		System.out.println("");
		System.out.printf("|%10s|%10s|%10s|", "Ban kinh", "Dien tich", "Chu vi");
		System.out.println();
		for (int i = 0; i < 35; i++) {
			System.out.printf("-");
		}
	}
	//in khoang cach
		public static void inKhoangCach() {
			for (int i = 0; i < 35; i++) {
				System.out.printf("_");
			}
		}
	//nhap mem
		public static HinhTron nhapMem() throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ban kinh: ");
			double bk = sc.nextDouble();
			
			
			HinhTron hnm = new HinhTron();
			hnm.setBanKinh(bk);
			return hnm;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Tam t = new Tam("O", 21, 4);
		HinhTron h1 = new HinhTron(24, t);
		System.out.println("Hinh tron tam:" + t.toString());
		inTieuDe();
		System.out.println();
		System.out.println(h1.toString());
		
		
		//Hinh tron nhap mem
		System.out.println();
		HinhTron hnm = nhapMem();
		System.out.println();
		inTieuDe();
		System.out.println();
		System.out.println(hnm.toString());
		inKhoangCach();
	}

}
