package utilities;

public class AllMethod {
	
	
	public int lenght(String inputString) {
		
		
		try {
		int stringLenght=inputString.length();
		return stringLenght;
		}catch(Exception e) {
			System.out.println("Please enter Valid string");
			return '0';
		}
	}
	
	public String longestWord(String inputString) {
		
		String longestWordInput=inputString;
		    try 
		       { String input=inputString;
		         String longest=" ";
		         String []wordSplit =input.split(" ");
                    for(String captureword:wordSplit)
                         {
        	              if(captureword.length()>longest.length()) 
        	                  {
        	                    longest=captureword;
        		     	      }
                          }
                return longest;
			
      		}catch(Exception e) 
		        {
			      System.out.println(e);
			      return " ";
		        }
				
	}

}
