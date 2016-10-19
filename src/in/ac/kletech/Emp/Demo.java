package in.ac.kletech.Emp;

public class Demo {

	
	public static void main(String[] args) {
	
		Employee[] e=new Employee[4];
		e[0]=new CommissionEmployee("ram","h","ce43",20);
		e[1]=new HourlyEmployee("sita","G","he43",3);
		e[2]=new SalariedEmployee("raju","K","se34",1000);
		e[3]=new BasePlusCommissionEmployee("rajesh", "P","bpce42",10,20);
		Invoice iv=new Invoice("invoice123","abc",10,10);
		for(int i=0;i<e.length;i++){
		      System.out.println("Employee" + " " +e[i].getFirstName() + " "+ "with social security nmber" +" " + e[i].getSocialSecurityNumber() + " "+
		    		  "is payed Rs." + " " +e[i].getPaymentAmount());
		}
		System.out.println("Invoice" +" "+  iv.getPaymentAmount());
		
		CommissionEmployee c=new CommissionEmployee("ramu","s","ce345",100);
		System.out.println(c.getFirstName() +" "+"is payed Rs." + c.getPaymentAmount());
		
		HourlyEmployee h=new HourlyEmployee("rahul","h","he98",10);
		System.out.println(h.getFirstName() + " " + "is payed Rs."+ h.getPaymentAmount());
		
		SalariedEmployee s=new SalariedEmployee("Gautam","P","se90",100);
		System.out.println(s.getFirstName()+" "+"is payed Rs." + s.getPaymentAmount());
		
		
	}

}
