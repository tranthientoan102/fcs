package vehicles;

import java.util.StringJoiner;

public class Bicycle extends VehicleAbstract {

	private boolean is_serviced;
	private String inDate, outDate, serviceResponsible;

	public boolean isIs_serviced() {
		return is_serviced;
	}

	public void setIs_serviced(boolean is_serviced) {
		this.is_serviced = is_serviced;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public String getOutDate() {
		return outDate;
	}

	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}

	public String getServiceResponsible() {
		return serviceResponsible;
	}

	public void setServiceResponsible(String serviceResponsible) {
		this.serviceResponsible = serviceResponsible;
	}

	public void checkoutService() {
		System.out.println("checkouted");
	}

	@Override
	public void changeGear(double amount) {
		System.out.printf("[vehicles.Bicycle %s] checkouted", this.getId());
	}

	@Override
	public void checkBreak(double amount) {
		System.out.printf("[vehicles.Bicycle %s] checked break", this.getId());
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Bicycle.class.getSimpleName() + "{", "}")
						.add("is_serviced=" + is_serviced)
						.add("inDate='" + inDate + "'")
						.add("outDate='" + outDate + "'")
						.add("serviceResponsible='" + serviceResponsible + "'")
						.add("super=" + super.toString())
						.toString();
	}
}
