package lessons;

import java.util.ArrayList;
public class MyClass {
	public static void main(String[] args){
		try {
			int a = 100/0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("-----结束--------");
	}

}
