public class Main {

	public static void main(String[] args) {

//		 test problem 03
		HandlingArrays.printArray( HandlingArrays.sumElements(new double[]{1.0, 2.0, 3.0}
				 , new double[]{3.0, 4.0, 6.0})
		);
//		HandlingArrays.printArray( HandlingArrays.sumElements(new double[]{1.0, 2.0, 3.0, 4.4}
//				 , new double[]{3.0, 4.0, 6.0})
//		);

//		test problem 5
		ParkingPlace p1 = new ParkingPlace("A1", "123 THIS STREET"
				 , ParkingPlace.TYPE_OFF_STREET, ParkingPlace.VEHICLE_CAR);
		ParkingPlace p2 = new ParkingPlace("A2", "143 THIS STREET"
				 , ParkingPlace.TYPE_OFF_STREET, ParkingPlace.VEHICLE_MOTORCYCLE);
		ParkingPlace p3 = new ParkingPlace("A3", "200 THAT STREET"
				 , ParkingPlace.TYPE_OFF_STREET, ParkingPlace.VEHICLE_CAR);
		ParkingPlace p4 = new ParkingPlace("A4", "200 THAT STREET"
				 , ParkingPlace.TYPE_OFF_STREET, ParkingPlace.VEHICLE_MOTORCYCLE);
		ParkingPlace p5 = new ParkingPlace("A5", "200 THAT STREET"
				 , ParkingPlace.TYPE_ON_STREET, ParkingPlace.VEHICLE_MOTORCYCLE);
		ParkingPlace p6 = new ParkingPlace("A6", "200 THAT STREET"
				 , ParkingPlace.TYPE_ON_STREET, ParkingPlace.VEHICLE_MOTORCYCLE);
		ParkingPlace p7 = new ParkingPlace("A5", "200 THAT STREET"
				 , ParkingPlace.TYPE_ON_STREET, ParkingPlace.VEHICLE_CAR);
		ParkingPlace p8 = new ParkingPlace("A6", "200 THAT STREET"
				 , ParkingPlace.TYPE_ON_STREET, ParkingPlace.VEHICLE_CAR);

		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3);
		System.out.println("p4 = " + p4);
		System.out.println("p5 = " + p5);
		System.out.println("p6 = " + p6);
		System.out.println("p7 = " + p7);
		System.out.println("p8 = " + p8);

	}
}
