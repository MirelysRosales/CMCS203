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
public class Patient 
{
	private String  firstName, middleName, lastName,
					street, city, state, emergencyContact, 
					zip, phone, emergencyPhone;

	/*
	 * Constructors
	 */

	public Patient(){}


	public Patient(String a, String b, String c)
	{
		this.firstName = a;
		this.middleName = b;
		this.lastName = c;
	}

	public Patient(String a, String b, String c, String d, String e,
				   String f, String h, String i, String j, String k)
	{
		this.firstName = a;
		this.middleName = b;
		this.lastName = c;
		this.street = d;
		this.city = e;
		this.state = f;
		this.zip = h;
		this.phone = i;
		this.emergencyContact = j;
		this.emergencyPhone = k;
	}

	/*
	 * Accessors
	 */

	public void setName(String a)
	{
		this.firstName = a;
	}

	public void setMiddleName(String b)
	{
		this.middleName = b;
	}

	public void setLastName(String c)
	{
		this.lastName = c;
	}

	public void setStreet(String d)
	{
		this.street = d;
	}

	public void setCity(String e)
	{
		this.city = e;
	}

	public void setState(String f)
	{
		this.state = f;
	}


	public void setZip(String h)
	{
		this.zip = h;
	}


	public void setPhone(String i)
	{
		this.phone = i;
	}


	public void setEmergencyContact(String j)
	{
		this.emergencyContact = j;
	}


	public void setEmergencyPhone(String k)
	{
		this.emergencyPhone = k;
	}

	/*
	 * Mutators
	 */

	public String getName()
	{
		return this.firstName;
	}

	public String getMiddleName()
	{
		return this.middleName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public String getStreet()
	{
		return this.street;
	}

	public String getCity()
	{
		return this.city;
	}

	public String getState()
	{
		return this.state;
	}

	public String getZip()
	{
		return this.zip;
	}

	public String getPhone()
	{
		return this.phone;
	}

	public String getEmergencyContact()
	{
		return this.emergencyContact;
	}

	public String getEmergencyPhone()
	{
		return this.emergencyPhone;
	}

	/*
	 * Methods
	 */

	public String buildFullName()
	{
		return firstName + " " + middleName + " " + lastName;
	}
	public String buildAddress()
	{
		return street + " " + city + " " + state + " " + zip;
	}


	public String buildEmergencyContact()
	{
		return emergencyContact + " " + emergencyPhone;
	}

	/*
	 * toString
	 */
	
	public String toString()
	{
	return "Patient Info: \n" 
	+ "Name: " + buildFullName() + "\n"
	+ "Address: " + buildAddress() + "\n"
	+ "Emergency Contact: " + buildEmergencyContact() + "\n";
	}
}
