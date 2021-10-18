class CRectangle{
	static int width;
	static int height;
	
	CRectangle(int w,int h) {	//a
		this.width = w;
		this.height = h;
	}
	CRectangle() {    //b
		width = 10;
		height = 8;
	}
	CRectangle() {     //c
		this(10,8);
		
	}
}
public class c01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
