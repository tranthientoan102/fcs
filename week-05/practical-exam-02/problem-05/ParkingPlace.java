
// creates a parking place of type, vehicle type,
public class ParkingPlace {

	// static variable for auto tracking parking slot index
	private static int ON_STREET_INDEX = 0;
	// pre-define contents
	public static String VEHICLE_CAR = "car";
	public static String VEHICLE_MOTORCYCLE = "motorcycle";
	public static String TYPE_ON_STREET = "on-street";
	public static String TYPE_OFF_STREET = "off-street";
	public static int PRICE_OFF_STREET = 15;
	public static int PRICE_ON_STREET_FREE = 0;
	public static int PRICE_ON_STREET_EVEN = 0;
	public static int PRICE_ON_STREET_ODD = 10;


	private String owner, address, type, vehicle;
	private int price;

	public ParkingPlace(String owner, String address, String type, String vehicle) {
		this.owner = owner;
		this.address = address;
		if (type.equals(TYPE_ON_STREET)){
			this.type = TYPE_ON_STREET;
			ParkingPlace.ON_STREET_INDEX += 1;
		}
		else this.type = TYPE_OFF_STREET;
		this.vehicle = vehicle.equals(VEHICLE_CAR) ? VEHICLE_CAR: VEHICLE_MOTORCYCLE;
		caclPrice();
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public int getPrice() {
		return price;
	}

	// calculate parking price according to the rules
	public void caclPrice() {
		if (this.type.equals(TYPE_OFF_STREET)) this.price = PRICE_OFF_STREET;
		else if (this.vehicle.equals(VEHICLE_MOTORCYCLE)) this.price = PRICE_ON_STREET_FREE;
		else if (ParkingPlace.ON_STREET_INDEX%2 ==0) this.price = PRICE_ON_STREET_EVEN;
		else this.price = PRICE_ON_STREET_ODD;
	}

	@Override
	public String toString() {
		return "ParkingPlace{" +
						"owner='" + owner + '\'' +
						", address='" + address + '\'' +
						", type='" + type + '\'' +
						", vehicle='" + vehicle + '\'' +
						", price=" + price +
						'}';
	}
}
