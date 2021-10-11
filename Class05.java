package test08;
class Cbox{
	Cbox box = new Cbox();
	int length,width,height =1;
	int volume,surfaceArea;
	void setvolume(int volume) {
		volume=length*width*height;
	}
	void setsurfaceArea(int surfaceArea) {
		surfaceArea=length*width*2+length*height*2+height*width*2;
	}
	void showData() {
		System.out.println("length="+length+"width="+width+"height="+height);
	}
	void showAll() {
		System.out.println("length="+length+"width="+width+"height="+height+"表面積="+surfaceArea+"體積="+volume);
	}
}
public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
