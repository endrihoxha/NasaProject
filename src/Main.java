public class Main {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		//declare planets
		Planet moon = new Planet();
		moon.setName("Moon");
		moon.setGravity(1.62);

		Planet earth = new Planet();
		earth.setName("Earth");
		earth.setGravity(9.807);

		Planet mars = new Planet();
		mars.setName("Mars");
		mars.setGravity(3.711);

		//declare expeditions
		int counter;
		Expedition apollo11 = new Expedition();
		apollo11.setName("Apollo 11");
		apollo11.setMass(28801);
		counter=0;
		apollo11.getPath().put(++counter +" "+Expedition.Direction.LAUNCH.toString(), earth);
		apollo11.getPath().put(++counter +" "+Expedition.Direction.LAND.toString(), moon);
		apollo11.getPath().put(++counter +" "+Expedition.Direction.LAUNCH.toString(), moon);
		apollo11.getPath().put(++counter +" "+Expedition.Direction.LAND.toString(), earth);

		Expedition missionMars = new Expedition();
		missionMars.setName("Mission on Mars");
		missionMars.setMass(14606);
		counter=0;
		missionMars.getPath().put(++counter +" "+Expedition.Direction.LAUNCH.toString(), earth);
		missionMars.getPath().put(++counter +" "+Expedition.Direction.LAND.toString(), mars);
		missionMars.getPath().put(++counter +" "+Expedition.Direction.LAUNCH.toString(), mars);
		missionMars.getPath().put(++counter +" "+Expedition.Direction.LAND.toString(), earth);

		Expedition passengerShip = new Expedition();
		passengerShip.setName("Passenger ship");
		passengerShip.setMass(75432 );
		counter=0;
		passengerShip.getPath().put(++counter +" "+Expedition.Direction.LAUNCH.toString(), earth);
		passengerShip.getPath().put(++counter +" "+Expedition.Direction.LAND.toString(), moon);
		passengerShip.getPath().put(++counter +" "+Expedition.Direction.LAUNCH.toString(), moon);
		passengerShip.getPath().put(++counter +" "+Expedition.Direction.LAND.toString(), mars);
		passengerShip.getPath().put(++counter +" "+Expedition.Direction.LAUNCH.toString(), mars);
		passengerShip.getPath().put(++counter +" "+Expedition.Direction.LAND.toString(), earth);


		// calculate fuel per expedition
		calculator.calculateFuelPerExpedition(apollo11);
		calculator.calculateFuelPerExpedition(missionMars);
		calculator.calculateFuelPerExpedition(passengerShip);


	}


}
