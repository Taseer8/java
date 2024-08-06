public class Shopping {
	
	public static float gSt(){
		int price = 9000;
		float gst = 0.18f;
		float csgst = price*gst;
		float disc =0.10f ;
		float totalAmounttopay = price+csgst;
		float discountamount = totalAmounttopay*disc;
		float grandtotal = totalAmounttopay-discountamount;
		return grandtotal;
	}
}