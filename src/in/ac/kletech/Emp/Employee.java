package in.ac.kletech.Emp;

interface Payable
{
	double getPaymentAmount();
}


 class Employee implements Payable
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public Employee(String firstName, String lastName,
			String socialSecurityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public double getPaymentAmount() {
		
		return 100;
	}
	
	
}
class CommissionEmployee extends Employee
{
	private double grossSales;
	private double CommissionRate;
	
	public CommissionEmployee(String firstName, String lastName,String socialSecurityNumber,
			double grossSales) {
		super(firstName,lastName,socialSecurityNumber);
		this.grossSales=grossSales;
		
	}

	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return CommissionRate;
	}

	@Override
	public double getPaymentAmount() {
		double amt;
		if(grossSales>10)
			CommissionRate=20;
		else if(grossSales>20)
			CommissionRate=100;
		else
			CommissionRate=150;
		amt=CommissionRate/100*grossSales;
		return amt;
	}
	
	
}


class HourlyEmployee extends Employee
{
	private double wages;
	private double hours;
	public double getWages() {
		return wages;
	}
	public double getHours() {
		return hours;
	}
	
	public HourlyEmployee(String firstName, String lastName,String socialSecurityNumber
			,double hours) {
		super(firstName,lastName,socialSecurityNumber);
		
		this.hours=hours;
	}
	@Override
	public double getPaymentAmount() {
		
		if(hours>0 && hours<5)
			wages=50*hours;
		else if(hours>0 &&  hours<=10)
			wages=100*hours;
		else
			wages=10;
		return wages;
	}
}

class SalariedEmployee extends Employee
{
	private double weeklySalary;

	public double getWeeklySalary() {
		return weeklySalary;
	}
	public SalariedEmployee(String firstName, String lastName,String socialSecurityNumber,
			double weeklySalary) {
		super(firstName,lastName,socialSecurityNumber);
		this.weeklySalary=weeklySalary;
	}
	@Override
	public double getPaymentAmount() {
		
		return weeklySalary;
	}
}

class BasePlusCommissionEmployee extends CommissionEmployee 
{
	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}
	
	public BasePlusCommissionEmployee(String firstName, String lastName,String socialSecurityNumber,
			double grossSales,double baseSalary) {
		super(firstName,lastName,socialSecurityNumber, grossSales);
		this.baseSalary=baseSalary;
	}
	@Override
	public double getPaymentAmount()
	{
		double amt;
		double c=getCommissionRate();
		if(getGrossSales()>10)
			c=100;
		else if(getGrossSales()>20)
			c=1000;
		else
			c=3000;
		
		amt=baseSalary+c/100*getGrossSales();
		return amt;
	}
}

class Invoice implements Payable
{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePeritem;
	public String getPartNumber() {
		return partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPricePeritem() {
		return pricePeritem;
	}
	public Invoice(String partNumber, String partDescription, int quantity,
			double pricePeritem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePeritem = pricePeritem;
	}
	@Override
	public double getPaymentAmount() {
		double amt;
		if(quantity>0)
		amt=pricePeritem*quantity;
		else
			amt=0;
		return amt;
	}
	
}
