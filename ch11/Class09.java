package java11;
interface Math2{
	public void show();
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
}
interface AdvencedMath{
	public void mod(int a,int b);
	public void fac(int a);
	public void pow(int a,int b);
}
class Compute2 implements Math2 , AdvencedMath{
	private int ans;
	public void add(int a, int b){
		this.ans=a+b;
	}
	public void sub(int a, int b){
		this.ans = a-b;
	}
	public void mul(int a, int b){
		this.ans = a*b;
	}
	public void div(int a, int b){
		this.ans = a/b;
	}
	public void show() {
		System.out.println("ans="+ans);
		
	}
	public void mod(int a, int b) {
		this.ans = a%b;
		
	}
	public void fac(int a) {
		int b = 1;
		for(int i = 1;i <= a;i++) {
			b = b*i;
		}
		this.ans = b;
		
	}
	public void pow(int a, int b) {
		this.ans = (int) Math.pow(a,b);
		
	}
}
public class Class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute2 cmp = new Compute2();
		cmp.mul(3,5);
		cmp.show();
		cmp.mod(14,5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	}

}
