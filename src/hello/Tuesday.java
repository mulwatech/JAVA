package hello;

public class Tuesday {
	public static void main(String[] args){
		saysomething("who said that");
		compute(10,20);
		
		

}
	public static void saysomething(String text){
		System.out.println(text);
	}
	public static void compute(int num1,int num2){
		int sum = num1 + num2;
		System.out.println("THE SUM IS :"+sum);
	}
		
	
}

