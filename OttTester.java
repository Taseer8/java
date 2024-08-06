public class OttTester{
	
	public static void main(String[] args){
		Ott.netflix();
		Ott.zee5();
		Ott.jioTv();
		Ott.Prime();
		Ott.starSports();
		String a=Ott.mini();
			System.out.println(a);
		byte b=Ott.hotstar();
			System.out.println(b);
		float c =  Ott.subscribeAmount();
			System.out.println(c);
		boolean d =  Ott.sonyLiv();
			System.out.println(d);
		char e=Ott.UserFirstLetter();
			System.out.println(e);
	}
}