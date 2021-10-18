class CSphere{
	private int x;
	private int y;
	private int z;
	private int radius;
	
	void setLocation(){			//a
		this.x = 3;
		this.y = 4;
		this.z = 5;
	}
	void setRadius() {			//b
		radius = 1;
	}
	void surfaceArea(int A) {	//c
		A =radius^2*314/100;
	}
	void volume(int V) {	//d
		V =radius^3*314*4/300;
	}
	void showCenter() {		//e
		System.out.println(x+y+z);
	}
}
public class c16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
