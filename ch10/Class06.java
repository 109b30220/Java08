package java10;
class CTriangle{
	protected int base;
	protected int height;
	protected void show() {
		System.out.println("base="+base+",height="+height);
	}
}
class CData extends CTriangle{
	CData(int a ,int b ){
		base =a ;
		height = b;
	}
	void area(){
		show();
		int a = (base * height)/2;
		System.out.println("area="+a);
	}
}
public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CData obj = new CData(3,8);
		obj.area();
		
	}

}
