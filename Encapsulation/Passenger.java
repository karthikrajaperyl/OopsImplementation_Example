package Encapsulation;

class PassengerDetails {
	private String name;
	private String source;
	private String destination;
	private int fare;
	private boolean insuranceApplied;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return this.source;
	}

	public void setDetination(String name) {
		this.destination = name;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getFare() {
		return fare;
	}
	
	public void setInsuranceApplied()
	{
		this.insuranceApplied=true;
	}
	public boolean getInsuranceDetails() {
		return this.insuranceApplied;
	}
}

class Passenger {
	public static void main(String[] main) {
		PassengerDetails passengerObj = new PassengerDetails();
		passengerObj.setName("Raja");
		passengerObj.setSource("Chennai");
		passengerObj.setDetination("Kolkata");
		passengerObj.setFare(100);
		passengerObj.setInsuranceApplied();
		System.out.println("\nName-" + passengerObj.getName() + "\nSource-" + passengerObj.getSource()
				+ "\nDestination-" + passengerObj.getDestination() + "\nFare Amount-" + passengerObj.getFare()+"\nInsurance Appiled-"+passengerObj.getInsuranceDetails());
	}
}
