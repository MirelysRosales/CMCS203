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
public class Procedure 
{
	private String procedureName, practitioner, procedureDate; 
	private double charges;

	/*
	 * Constructors
	 */

	public Procedure() {}

	public Procedure(String procedureName, String procedureDate)
	{
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}

	public Procedure(String procedureName, String practitioner, String procedureDate, double charges)
	{
		this.procedureName = procedureName;
		this.practitioner = practitioner;
		this.procedureDate = procedureDate;
		this.charges = charges;
	}

	/*
	 * Accessors
	 */

	public void setProcedureName(String procedureName)
	{
		this.procedureName = procedureName;
	}

	public void setPracitioner(String practitioner)
	{
		this.practitioner = practitioner;
	}

	public void setProceduredate(String procedureDate)
	{
		this.procedureDate = procedureDate;
	}

	public void setCharges(double charges)
	{
		this.charges = charges;
	}

	/*
	 * Mutators
	 */

	public String getProcedureName()
	{
		return this.procedureName;
	}

	public String getPractitioner()
	{
		return this.practitioner;
	}

	public String getProceduredate()
	{
		return this.procedureDate;
	}

	public double getCharges()
	{
		return this.charges;
	}

	/*
	 * toString
	 */

	public String toString()
	{
		return " 	Procedure: " + procedureName + "\n"
				+ " 	Procedure Date: " + procedureDate + "\n"
				+ " 	Practitioner: " + practitioner + "\n"
				+ " 	Charge: " + charges;
	}


}
