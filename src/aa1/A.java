package aa1;

public class A {
	public static void main(String[] args) {
		UseA c=new UseA();
		int a=3;
		int b=7;
		int result=c.add(a,b);
		System.out.printf("%d+%d=%d",a,b,result);
	}
}

class UseA {
	public int add(int a,int b) {
		int result=a+b;
		return result;
	}
}
