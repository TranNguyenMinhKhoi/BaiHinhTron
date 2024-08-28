package may26_20094511_TranNguyenMinhKhoi;

public class Tam {
	private String ten;
	private double x;
	private double y;
	//dong goi
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) throws Exception {
		if (ten!=null) {
			this.ten = ten;
		}else {
			throw new Exception("Loi! Ten hinh tron khong duoc rong!");
		}
		
	}
	public double getX() {
		return x;
	}
	public void setX(double x) throws Exception {
		if (x>0) {
			this.x = x;
		}else {
			throw new Exception("Loi! Toa do x phai >0!");
		}
	}
	public double getY() {
		return y;
	}
	public void setY(double y) throws Exception {
		if (y>0) {
			this.y = y;
		}else {
			throw new Exception("Loi! Toa do y phai >0!");
		}
	}
	//Constructor
	public Tam() {}
	public Tam(String ten, double x, double y) throws Exception {
		super();
		if (ten!=null) {
			this.ten = ten;
		}else {
			throw new Exception("Loi! Ten hinh tron khong duoc rong!");
		}
		
		if (x>0) {
			this.x = x;
		}else {
			throw new Exception("Loi! Toa do x phai >0!");
		}
		
		if (y>0) {
			this.y = y;
		}else {
			throw new Exception("Loi! Toa do y phai >0!");
		}
	}
	
	//mau in ra
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		s=s+s.format("%2s(%2s, %2s)", getTen(), getX(), getY());
		return s;
	}
}
