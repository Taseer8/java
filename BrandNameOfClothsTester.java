public class BrandNameOfClothsTester{
	public static void main (String[] args){
		 
		int a = BrandNameOfCloths.price();
		System.out.println("price :"+a);

		String b = BrandNameOfCloths.nameOfBrand();
		System.out.println("Name of the brand  :"+b);

		byte c = BrandNameOfCloths.customerTokenNmber();
		System.out.println("customerTokenNmber: "+c);

		float d= BrandNameOfCloths.reuiredlenght();
		System.out.println("reuiredlenght: "+d);

		double e= BrandNameOfCloths.totalamount();
		System.out.println("totalamount: "+e);

		short f= BrandNameOfCloths.customerhight();
		System.out.println("customerhight :"+f);

		long g = BrandNameOfCloths.customerNumber();
		System.out.println(" customerNumber:"+g);

		boolean h = BrandNameOfCloths.rymendclostisavabile();
		System.out.println("rymendclostisavabile "+h);

		char i = BrandNameOfCloths.logoOfBrand();
		System.out.println("logoOfBrand: "+i);
		
	}
}