public class BusOne{
	
	public static void main(String args[]){
	String busName[] = {"Kstrc","bmtc"};
	
	for(int i = 0; i < busName.length; i++){
		System.out.println(+i +"Bus type:"+busName[i]);
	}
	char []busrout = {'A', 'B', 'c'};
	for(int s=busrout.length-1; s>=0; s--){
		System.out.println(+s+":busrout:"+busrout[s]);
	}
		
	}
}