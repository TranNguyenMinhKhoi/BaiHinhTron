package may26_20094511_TranNguyenMinhKhoi;

public class HinhTron {
	public double banKinh;
	private Tam t;
	//hang thuc
	public static final double PI=3.1416;
	
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if(t!=null) {
			this.t = t;
		}else {
			throw new Exception("Loi! Tam khong duoc rong!");
		}
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bk) throws Exception {
		if(bk>0) {
			this.banKinh = bk;
		}else {
			throw new Exception("Loi! Ban kinh phai >0");
		}
	}	
	//Constructor
	public HinhTron() {}
	public HinhTron(double banKinh, Tam t) {
		super();
		this.banKinh = banKinh;
		this.t = t;
	}
	
	//tinh dien tich va chu vi
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*PI;
	}
	public double getChuVi() {
		return getBanKinh()*2*PI;
	}
	
	//mau in ra
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String m="";
		m = m+m.format("|%10s|%10s|%10s|", getBanKinh(), getDienTich(), getChuVi());
		return m;
	}
}
