import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person implements Comparable {
	
	String firstName;
	String lastName;
	String birthday;
	public Date birthdayDate;

	Person(String ime, String prezime, String datum){
		firstName = ime;
		lastName = prezime;
		birthday = datum;
		SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy");
		try {
			birthdayDate=format.parse(datum);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	@Override
	public int compareTo(Object p2) {
		
		return birthdayDate.compareTo(((Person)p2).birthdayDate);
	}
};