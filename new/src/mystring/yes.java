package mystring;

public class yes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "It is raining outside! Can i have a raincoat Please ";
		char []charArray = str.toCharArray(); 
		int vowel = 0;
		for(char ch:charArray)
		{
			if(ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' ||
					ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u');
	
	
		{	
			vowel++;
		}
		}
	
	System.out.println(vowel);
		
		System.out.println(str.toLowerCase());
		System.out.println(str.replace("raincoat", "ubbrella"));

				
				System.out.println(str.trim());		
				
				String[] stre = str.split(" ");
				
				String see = String.join("#",stre);
				System.out.println(see);
				
				
		
		
	}
}
