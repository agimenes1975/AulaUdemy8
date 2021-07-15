package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	
	private OutsourcedEmployee() {	
		super();
	}	

	public OutsourcedEmployee(String name, int hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
	

}
