public class Class05 {
class CCount{
	int cnt =0;
	void count(){
		cnt = cnt+1;
	}
	void setZero(){
		cnt = 0;
	}
	void setValue(int n) {
		cnt = n;
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//cnt是實例變數，因為沒有static
//count()是實例函數，因為沒有static
