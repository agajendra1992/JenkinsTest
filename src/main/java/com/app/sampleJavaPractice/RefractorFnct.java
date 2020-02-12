package com.app.sampleJavaPractice;

/**
 * PRINT THE REVERSE WITH USING STRING BUFFER FUNCTION
 *
 */
public class RefractorFnct 
{
   public static void main( String[] args )
    {
  
	   String s = "TEST THE SAMPLE";
	   
	   
	   StringBuffer stbuff = new StringBuffer(s);
	   
	  StringBuffer  s1= stbuff.reverse();
	   System.out.println(s1);
	 
    }
}
