package week3.day1ass;

public class ReverseEvenPositionWords {

	

	    public static void main(String[] args) {
			
			String test = "I am a software tester"; 
			String[] words = test.split(" ");		
			String result = "";
			
			System.out.println("Given String : " + "\n" +test);
			
			for (int i = 0; i < words.length; i++) 
			{
				if(i%2 !=0)
				{
					String rev="";
					char[] charr = words[i].toCharArray();
					
					for (int j = charr.length-1; j >= 0;j--) 
					{
						rev = rev + charr[j];
					}
					result = result + rev + " ";
				}
				else
					result = result + words[i] + " ";
		}
			
			System.out.println("After Reverse Even words: " +"\n"+result);
		}

	}