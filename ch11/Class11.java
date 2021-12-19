package java11;
class CStu{
	
	public CStu(String id, String name, int mid, int finl, int common) {
		
	}
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	public void show() {
		System.out.println("mid="+mid+"finl="+finl+"common="+common);
		System.out.println("total="+mid*0.3+finl*0.3+common*0.4);
		System.out.println("id="+id+"name="+name);
	}

}
interface Data{
	public void showData();
}
interface Test{
	public void showScore();
	public double calcu();
}
class D0 extends CStu implements Data,Test{
	public void showScore() {
		System.out.println("mid="+mid+"finl="+finl+"common="+common);
		
	}


	public double calcu() {
		int total;
		total = (int) (mid*0.3+fin*0.3+com*0.4);
		return total;
	}


	public void showData() {
		System.out.println("id="+id+"name="+name);
		
	}
	public void show() {
		showData();
		calcu();
		showScore();
	}
	
}
public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu = new CStu("940001","Fiona",90,92,85);
		stu.show();
	}

}
