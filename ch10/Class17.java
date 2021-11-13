package java10;


class car{
	protected String owner;
	protected String id;
	final void show() {
		System.out.println("車主姓名:"+owner);
		System.out.println("車牌號碼:"+id);
	}
	void CRectangle(String own,String s){
		owner = own;
		id = s;
	}
	void Car(String own,String s){
		
	}
}
class CColor extends car{
	private String color;
	CColor(String own,String s,String c){
		owner = own;
		id = s ;
		color =c ;
	}
	void CColor1(){
		show();
		System.out.println("車身顏色:"+color);
	}
}
public class Class17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CColor mycar = new CColor("Riaan","A1-2345","Black");
		mycar.CColor1();
	}

}
//子類別show有錯誤。
//改成這樣(?
