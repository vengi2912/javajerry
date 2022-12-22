package testingprograms;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Trimble Technologies",Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("trimble  the technologies");
		Boolean matchfound = matcher.find();
		
		System.out.println(matchfound);
		
		if(matchfound) {
			System.out.println("match found success");
		}else {
			System.out.println("not found");
		}
		
		

	}

}
