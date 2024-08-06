
public class Appi{
	public static void checkEvenOrOdd(){
		int n=10;
		if(n%2 == 0){
			System.out.println("its is a even number");
		}else {
			System.out.println("it is a odd number");
		}
	}
	public  static void swapTwoNumber(){
		int number1=30, number2=40;
		int temp=number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("number1 is:"+temp);
		System.out.println(	"Number2 is :" +number1);
		
	}
	public static void swapTheNo(){
		int a=10, b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" a:"+a+" b"+b);
	}
	public static void numberIsDiv(){
		int n=9;
		if(n%3==0){
			System.out.println("the given number is divided by 3");
		}
		else{
			System.out.println("the given number is not divisiable by 3");
		}
		
	}
	public static void leapYr(){
		int year=366;
		if( year==366){
			System.out.println("it is a leep year");
		}else{
			System.out.println("it is not a leep year");
		}
	}
	public static void num(){
		int countEven=0;
		int countOdd=0;
		for(int value= 0; value<=1000; value++){
			//System.out.println("the value is :"+value);
			if(value%2==0){
				countEven++;
			}else{
				countOdd++;
			}
			
		}
		System.out.println("total number of even number is : "+countEven +" \n" +"total no of odd number is :"+countOdd);
	}
	public static void prime(){
		int count =0;
		int n=9;
		for(int i=1; i<=n; i++){
			if(n%i==0){
				count++;
			}
		}
		if(count>2){
			System.out.println("the number is not a prime");
			}else{
				System.out.println("the number is a prime");
			}
		
	}
		
		
		
}