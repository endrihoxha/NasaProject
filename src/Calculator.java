import java.util.Map;

public class Calculator {



	public int totLauchFuel(int expeditionMass, double planetGravity) {

		int fuel=0;
		int extraFuel=0;

		fuel = launchFuel(expeditionMass, planetGravity);
		extraFuel = launchFuel(fuel, planetGravity);
		fuel = fuel + extraFuel;

		while(extraFuel >0) {
			extraFuel=launchFuel(extraFuel, planetGravity);
			fuel= fuel+extraFuel;
		}		
		return fuel;		
	}


	public int totLandFuel(int expeditionMass, double planetGravity) {

		int fuel=0;
		int extraFuel=0;

		fuel = landingFuel(expeditionMass, planetGravity);
		extraFuel = landingFuel(fuel, planetGravity);
		fuel = fuel + extraFuel;

		while(extraFuel >0) {
			extraFuel=landingFuel(extraFuel, planetGravity);
			fuel= fuel+extraFuel;
		}	
		return fuel;	
	}

	public int launchFuel(int mass, double gravity ) {
		int fuel = (int) Math.floor(mass* gravity * 0.042 -33);

		if (fuel > 0) {
			return fuel;
		}else
			return 0;
	}


	public int landingFuel(int mass, double gravity ) {
		int fuel = (int) Math.floor(mass* gravity * 0.033 -42);

		if (fuel > 0) {
			return fuel;
		}else
			return 0;
	}


	public int calculateFuelPerExpedition(Expedition expedition ){
		Calculator calculator = new Calculator();
		int expediotionFule=0;
		for (Map.Entry<String, Planet> e : expedition.getPath().descendingMap().entrySet()) {
			if(e.getKey().contains(Expedition.Direction.LAUNCH.toString())) {
				expediotionFule+=calculator.totLauchFuel(expedition.getMass()+expediotionFule,e.getValue().getGravity());
			}else if(e.getKey().contains(Expedition.Direction.LAND.toString())) {
				expediotionFule+=calculator.totLandFuel(expedition.getMass()+expediotionFule,e.getValue().getGravity());
			}
		}
		System.out.println("\'"+expedition.getName()+"\' fuel mass="+expediotionFule+" kg");
		return expediotionFule;
	}
}
