/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: Create 2 classes for Patients and Procedures and utilize objects
 * Due: 09/27/2023
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my 
 * code to any student.
 * Mirelys Rosales
 */
public class PatientDriverApp 
{

	public static void main(String[] args) 
	{
			
			Patient p1 = new Patient("Jenny", "Elaine", "Santori", "123 Main Street", "MyTown", "CA", "01234", "777-555-1213", "Bill Santori", "777-555-1212");
			
			Procedure pr1 = new Procedure();
			pr1.setProcedureName("Physical Exam");
			pr1.setProceduredate("07/20/2019");
			pr1.setPracitioner("Dr. Irvine");
			pr1.setCharges(3250.0);
			
			Procedure pr2 = new Procedure("X-Ray", "07/20/2019");
			pr2.setPracitioner("Dr. Jamison");
			pr2.setCharges(5500.43);
			
			Procedure pr3 = new Procedure("Blood Test", "Dr. Smith", "07/20/2019", 1400.75);
			
			displayPatient(p1);
			displayProcedure(pr1, pr2, pr3);
			
			double totalCharges = calculateCharges(pr1, pr2, pr3);
			System.out.print("Total Charges: " + totalCharges + "\n");
			
			System.out.println("Student Name: Mirelys Rosales");
			System.out.println("MC#: M21088162");
			System.out.println("Due Date: 09/27/2023");
			
	}
	
	/*
	 * Methods
	 */
	
	public static void displayPatient(Patient p1)
	{
		System.out.println(p1.toString());
	}
	
	public static void displayProcedure(Procedure pr1, Procedure pr2, Procedure pr3) 
	{
		System.out.println(pr1.toString() + "\n");
		System.out.println(pr2.toString() + "\n");
		System.out.println(pr3.toString() + "\n");
	}
	
	public static double calculateCharges(Procedure pr1, Procedure pr2, Procedure pr3)
	{
		return pr1.getCharges() + pr2.getCharges() + pr3.getCharges();
	}

}
