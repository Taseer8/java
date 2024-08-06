public class Property {
   
    public static int propertyId;
    public static double propertyValue;
    public static String propertyAddress;
    public static boolean isAvailableForRent;
    public static char propertyType; 
    public static float areaInSquareMeters;
    public static long ownerContactNumber;
    public static byte numberOfBedrooms;
    public static short constructionYear;
	public static char blockName;
 

    public static void main(String[] args) {
        Property.propertyId = 101;
        Property.propertyValue = 250000.50;
        Property.propertyAddress = "123 Maple Street, udupi";
        Property.isAvailableForRent = true;
        Property.propertyType = 'R'; 
        Property.areaInSquareMeters = 120.5f;
        Property.ownerContactNumber = 9876543210L;
        Property.numberOfBedrooms = 3;
        Property.constructionYear = 2015;
		Property.blockName = 'G';
		if(propertyId == 101){
			System.out.println("propertyId :"+Property.propertyId);
		}
		else{
			System.out.println("propertyId");
		}
		if(propertyValue == 250000.50){
			System.out.println("propertyValue:"+Property.propertyValue);
		}
		else{
			System.out.println("propertyValue");
		}
		if(propertyAddress == "123 Maple Street, udupi"){
			System.out.println(" propertyAddress"+Property.propertyAddress);
		}
		else{
			System.out.println("propertyAddress");
		}
		if(isAvailableForRent == true){
			System.out.println("isAvailableForRent:"+Property.isAvailableForRent);
		}
		else{
			System.out.println("isAvailableForRent");
		}
		if(propertyType == 'R'){
			System.out.println("propertyValue:"+Property.propertyType);
		}
		else{
			System.out.println("propertyValue");
		}
		if(areaInSquareMeters == 120.5f ){
			System.out.println("areaInSquareMeters:"+Property.areaInSquareMeters);
		}
		else{
			System.out.println("areaInSquareMeters");
		}

		if(ownerContactNumber == 9876543210L){
			System.out.println("ownerContactNumber:"+Property.ownerContactNumber);
		}
		else{
			System.out.println("ownerContactNumber");
		}
		if(numberOfBedrooms == 3){
			System.out.println("numberOfBedrooms:"+Property.numberOfBedrooms);
		}
		else{
			System.out.println("numberOfBedrooms");
		}
		if(constructionYear == 2015){
			System.out.println("constructionYear:"+Property.constructionYear);
		}
		else{
			System.out.println("constructionYear");
		}
		if(blockName == 'G'){
			System.out.println("blockName:"+Property.blockName);
		}
		else{
			System.out.println("blockName");
		}
		
    
	
	
	}
}