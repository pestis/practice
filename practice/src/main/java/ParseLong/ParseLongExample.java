package main.java.ParseLong;
public class ParseLongExample {

	
	
	public static long stringToLong(String str){
		
		char charArray[] = str.toCharArray();
		long result = 0;
		long value = 0;
		char zero = '0';
		int powerIdx = str.length();
		
		if(str.length() == 0){
			return 0;
		}
		else if(str.length()==1){
			return ((long)charArray[0]) - ((long)zero);
		}
				
 		for(int idx = 0; idx < charArray.length; idx++){
 			value = ((long)charArray[idx]) - ((long)zero);
			result +=  value * (Math.pow(10, (powerIdx-1)));
			System.out.println(result);
			powerIdx--;
		}
		
		return result;
	}
	
	
	
	
	
	
	
	public static void main(String args[]){
		
		String nums = "0123146091230";
		//stringToLong(nums);
		
		System.out.println(stringToLong(nums));
		
	}
	
}
