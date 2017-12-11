import java.util.ArrayList;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

 /*
 * Edits by: Robert Hill-Guarino and Evan Schimberg
 *
 * Class: AP Computer Science
 *
 * Assignment: Problem Set 9a - Magpie Activity 5
 *
 * Date: 12/21/2017
 *
 * Purpose: We made several edits to the provided magpie code in order to
 * improve the code. More keywords and responses were added to make the bot
 * more involved in its chatting.
 *
 */


public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Hello, my name is Bart. ";
		}
		else if (whichResponse == 1)
		{
			response = "Nope, I don't want to talk.";
		}
		else if (whichResponse == 2)
		{
			response = "What do you want? I'm tired.";
		}
		else if (whichResponse == 3)
		{
			response = "How's it hangin' I'm Bart the ChatBart. ";
		}

		return response;
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0){
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		} else if(statement.indexOf("love")>=0){
			response = "Why so positive?";
		} else if(statement.indexOf("cat")>=0||statement.indexOf("dog")>=0){
			response = "Tell me more about your pets.";
		} else if(statement.indexOf("Mr.")>=0){
			response = "I think he sounds like a good teacher.";
		} else if(statement.indexOf("Mrs.")>=0||statement.indexOf("Ms.")>=0){
			response = "She sounds like she is a good teacher.";
		} else if(statement.indexOf("hate")>=0){
			response = "I hate that too.";
		} else if(statement.indexOf("happy")>=0){
			response = "Why does that make you happy?";
		} else if(statement.trim().isEmpty()){
			response = "Say something, I'm giving up one you.";
		}
		else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		ArrayList<String> randomResponses = new ArrayList<String>();
		final int NUMBER_OF_RESPONSES = randomResponses.size();
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		randomResponses.add("Interesting, tell me more.");
		randomResponses.add("Hmmm.");
		randomResponses.add("Do you really think so?");
		randomResponses.add("You don't say.");
		randomResponses.add("Yeah.");
		randomResponses.add("Byeah.");
		randomResponses.add("Wazzap!");
		randomResponses.add("It is what it is.");
		randomResponses.add("The end of times has come. There is no hope for you.");
		response = randomResponses.get(whichResponse-1);
		return response;
	}
}
