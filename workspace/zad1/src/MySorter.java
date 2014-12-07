import java.util.List;
import java.util.Collections;

public class MySorter{
	
 public static void sortByBirthday(List<Person> p){

	 
	 Collections.sort(p);
	 for(int i=0; i < p.size(); i++)
		 System.out.printf("%d. %s %s %s\n", i+1, p.get(i).firstName, p.get(i).lastName, p.get(i).birthday);
	 
	 
 }

};
