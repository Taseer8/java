public class Vehical {
	static int maxSpeed = 240;               
    static double defaultFuelCapacity = 50.5; 
    static char defaultTransmission = 'A';   
    static boolean hasAirbags = true;        
    static String vehicleType = "fuel";    
    static long vehicleID = 1234567890L;     
    static float engineDisplacement = 2.0f; 
    static short numberOfDoors = 4;          
    static byte numberOfWheels = 4;         
    static double currentSpeed = 0.0; 
}
	public static void main (String[] args ){
		int testDriveSpeed = 120;              
        double fuelConsumed = 10.5;              
        char driverMode = 'S';                 
        boolean engineStatus = true;            
        String testDriveFeedback = "Excellent";
		
		if( maxSpeed >= testDriveSpeed /2){
			System.out.println("the speed is " +maxSpeed);
		}else{
			System.out.println("X");
		}
		if(defaultFuelCapacity == 50.5 ){
			System.out.println("default Fuel Capacity :" +defaultFuelCapacity);
		}else{
			System.out.println("defaultFuelCapacity");
		}
		if(defaultTransmission == 'A' ){
			System.out.println("default Transmission:" + defaultTransmission);
		}else{
			System.out.println("default Transmission");
		}
		if(hasAirbags == false ){
			System.out.println("there is no air bags ");
		}else{
			System.out.println("Thier is airbags");
		}
		if(vehicleType == "diesel" ){
			System.out.println("vehicle Type ");
		}else{
			System.out.println("vehicleType "+vehicleType);
		}
		if(vehicleID == 1234567890 ){
			System.out.println("my vehicleID is  ");
		}else{
			System.out.println("my vehicle id ");
		}
		if( engineDisplacement == 2.0 ){
			System.out.println("engineDisplacement " + engineDisplacement);
		}else{
			System.out.println("engineDisplacement");
		}
		if( numberOfDoors <= 4 ){
			System.out.println("numberOfDoors are " +numberOfDoors);
		}else{
			System.out.println("number Of Doors are");
		}
		if(numberOfWheels == 4  ){
			System.out.println("numberOfWheels ");
		}else{
			System.out.println("numberOfWheels");
		}
		if( currentSpeed == 100.0 ){
			System.out.println("currentSpeed is  ");
		}else{
			System.out.println("currentSpeed is ");
		}
		// local variables
			if( fuelConsumed == 10.5 ){
			System.out.println("total fuel is  consumed for this trip ");
		}else{
			System.out.println("fuelConsumed ");
		}
			if(driverMode == 's' ){
			System.out.println("driverMode ");
		}else{
			System.out.println("driverMode ");
		}if(engineStatus == true ){
			System.out.println(" its engine Status  is really good");
		}else{
			System.out.println(" engineStatus");
		}
		if(testDriveFeedback == "Excellent" ){
			System.out.println(" testDriveFeedback "+testDriveFeedback);
		}else{
			System.out.println(" testDriveFeedback");
		}
	}
}
