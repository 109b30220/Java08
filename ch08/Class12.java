package test08;
class Cwin{
	int width, height; //成員
	String name;
	void setW(int w) { //a
		width=w;
	}
	void setH(int h) { //a
		height=h;
	}
	void setName(String s) {  
		name=s;
	}
	void show() {   //output
		System.out.println("Name="+this.name);
		System.out.println("W="+this.width+" ,"+"H="+this.height);
	}
	void setWindows(int w,int h) {  //b
		this.width=w;
		this.height=h;
	}
	void setWindows(int w,int h,String s) { //c
		this.width=w;
		this.height=h;
		this.name=s;
	}
}

public class try01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cwin cw = new Cwin();
		cw.setName("1st Windows");
		cw.setW(5);
		cw.setH(3);
		cw.show();
	}

}
