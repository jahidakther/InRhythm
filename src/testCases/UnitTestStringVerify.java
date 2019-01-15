package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.AllMethod;

public class UnitTestStringVerify {
	AllMethod am=new AllMethod();
	
  @Test
  public void testCaseforStringLenght() {
	  Assert.assertEquals(am.lenght("The cow jumped over the moon"),28);
	  
  }
  @Test
  public void testCaseForLongestWord() {
	  Assert.assertEquals(am.longestWord("The cow jumped over the moon"),"jumped");
	  
	  
	  
  }
}
