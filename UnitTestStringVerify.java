package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.AllMethod;

public class UnitTestStringVerify {
	AllMethod am=new AllMethod();
	
  //Inject a string into the two method expected return value should be a integer and a string. 	
  @Test
  public void methodTesting() {
	  String inputString="The cow jumped over the moon";
	  int stringLenght= am.lenght(inputString);
	  String longestWord=am.longestWord(inputString);
	  System.out.println("input String lenght is :" +stringLenght);
	  System.out.println("Longest word into the input String is :" +longestWord);
  }
  
	
//Actual and expected result should be match.
  @Test
  public void testCaseforStringLenght() {
	  int expectedResult=28;
	  int actuelResult=am.lenght("The cow jumped over the moon");
	  Assert.assertEquals(actuelResult,expectedResult);
  }

  
//Actual and expected result should be match.
  @Test
  public void testCaseForLongestWord() {
	  
	  String expectedResult="jumped";
	  String actuelResult=am.longestWord("The cow jumped over the moon");
	  Assert.assertEquals(actuelResult,expectedResult);
 }
}
