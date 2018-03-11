import java.io.*;

/**
 *  
 * Really Shitty Demo by Gary Wetter 4-10-13 <br />
 * Copyright (c) 2012-2020 Gary Wetter. <p>
 *  
 * Evolution: 2 <br />
 * Interactive Functionality now Featured with a buffered std in.         
 * System Feature Choices, and User Login, Authentication, and other 
 * interactive flows
 * Flow control introduced.
 * Started minor modularity with promptUser() Method. <p>
 * 
 * Requirements: Defecation Classes<p>
 * 
 * Compilation:  javac DefecationSessionDemo.java <br />
 * Execution:    java DefecationSessionDemo<p>
 *  
 * Description:<br />
 * This nifty program simulates Personal Health Care & Maintence Informatics. 
 * It keeps track of the number of times she went and the rhythm of the movements 
 * she makes, how fast, for how long per movement and in total, and what stool type  
 * she observed before flushing while making a movement.<p>
 * 
 * Sample Runs:<br />
 * % java DefecationSessionDemo 6 6 6 6 3 <br />
 * cadence:6 speed:6 duration:6 session duration:6 Bristol Stool Type Observed:3<br />
 * cadence:3 speed:3 duration:33 session duration:60 Bristol Stool Type Observed:2<br />
 * cadence:2 speed:10 duration:5 session duration:10 Bristol Stool Type Observed:6<br />   
 * cadence:4 speed:9 duration:10 session duration:5 Bristol Stool Type Observed:7<p>
 * 
 * @author      Gary Wetter
 * @version     0.0, 04/10/2013
 * @since       0.0
 *
 */

class DefecationSessionDemo 
{
  //
  public static String userSelection = null;
  public static String userName = null;
  public static String systemChoices = null;
  public static String systemUsers = null;
  public static boolean wantsToLogin = false;
  public static boolean wantsToCreate = false;
  public static boolean authenticatedUser = false;
  public static boolean userAnswers = false;
  public static Boolean zero = true;
  public static Boolean one = true;
  
  //  open up standard input, and buffer it
  public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
  
  public static void main(String[ ] args) throws Exception
  {
    // Create Defecation Test Sessions
    Defecation session1 = new Defecation();
    Defecation session2 = new Defecation();
    
    // prompt the user to enter their name
    session1.promptUser(zero, userSelection);
    
    // use the readLine method of the BufferedReader class
    // to get whatever line the user types in:
    userSelection = bufferedReader.readLine();
    
    /* System Login or Create */
    if(userSelection.equalsIgnoreCase("login"))
    {
      session1.promptUser(zero, userSelection);
      wantsToLogin = true;
    }
    else
    {
      session1.promptUser(zero, userSelection);
      wantsToCreate = true;
    }
    
    /* User Login */
    if(wantsToLogin)
    {
      // prompt the user to enter their name
      System.out.print("Enter your name: ");
      userName = bufferedReader.readLine();
      System.out.println("Thanks " + userName + ", please wait while we authenticate your account...\n");
      
      /* Authenticate User Login */
      if(userName.equalsIgnoreCase("gary"))
      {
        authenticatedUser = true;
      }
    }
    
    /* UserCreate  */
    if(wantsToCreate)
    {
      // prompt the user to enter their name
      System.out.print("Enter your name: ");
      userName = bufferedReader.readLine();
      
      System.out.println("Thanks " + userName + ", please wait while we create your account...\n");
      System.out.println("Thanks " + userName + ", account created...\n");
      
    }
    
    /* User Authenticated & Logged in */
    if(authenticatedUser)
    {      
      System.out.println("Hello Again, " + userName + " we are retreiving your information now...\n");
      
      System.out.println("Here are your regualrity trends: \n");
      
      //change cli to static input, then print.
      session1.changeCadence(3);
      session1.changeDuration(33);
      session1.changeSessionDuration(60);
      session1.changeSpeed(3);
      session1.applyBristolType(2);
      session1.printStates();
      
      //take static input, then print
      session2.changeCadence(2);
      session2.changeDuration(5);
      session2.changeSessionDuration(10);
      session2.changeSpeed(10);
      session2.applyBristolType(6);
      session2.printStates();
      
      // change session 2 static input, and print
      session2.changeCadence(4);
      session2.changeDuration(10);
      session2.changeSessionDuration(5);
      session2.changeSpeed(9);
      session2.applyBristolType(7);
      session2.printStates();
      
      while(!(userAnswers))
      {
        // prompt the user to enter a choice
        System.out.print("\n It has been a while, why? unable to go? or no records?: \n");
        userSelection = bufferedReader.readLine();
        
        if(userSelection.equalsIgnoreCase("no records"))
        {
          System.out.print("\n please enter new data, this will show a gap: \n");
          //userSelection = bufferedReader.readLine();
          userAnswers = true;
        }
        else if(userSelection.equalsIgnoreCase("unable to go"))
        {
          System.out.print("\n please enter new data on why you havent gone: \n");
          //userSelection = bufferedReader.readLine();
          userAnswers = true;
        }
        else if(userSelection.equalsIgnoreCase("been a while"))
        {
          System.out.print("\n please enter new data: \n");
          //userSelection = bufferedReader.readLine();
          userAnswers = true;
        }
        else
        {
          System.out.print("\n please enter a valid choice! \n");
        }
      }
      
      while((userAnswers))
      {
        // prompt the user to enter a choice
        //System.out.print("\n It has been a while, why? unable to go? or no records?: \n");
        userSelection = bufferedReader.readLine();
      }
    }
  }
}

