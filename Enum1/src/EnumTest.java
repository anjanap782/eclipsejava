
public class EnumTest {
public enum days{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY};
	
	
	
	
	
	public static void main(String[] args) {
		for(days s:days.values())
		{
			System.out.println(s);
			
			
		}
		System.out.println(days.valueOf("MONDAY"));
		
		System.out.println(days.valueOf("MONDAY").ordinal());
		

	}

}
