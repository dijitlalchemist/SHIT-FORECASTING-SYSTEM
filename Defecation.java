/**
 *
 * Really Shitty Classes by Gary Wetter 4-10-13 <br />
 * Copyright (c) 2012-2020 Gary Wetter. <p>
 *  
 * Evolution:<br /> 
 * 0, 1. Same Features.<br />
 * 2. Started modularity; started ground work for new mehtods 
 * to handle user propmting, login, and account creation.<p>
 *  
 * This nifty class is For use with DefecationSessionDemo.java.
 * See DefecationSessionDemo for more information.<p>
 * 
 * @author      Gary Wetter
 * @version     0.0, 04/10/2013
 * @since       0.0
 *
 */

class Defecation 
{
  //stool session
  int cadence = 0; int speed = 0; int duration = 0; int sessionDuration = 0;
  
  //bristol types
  int type = 0;
  
  //date
  int dd = 0; int yyyy = 0; int mm = 0;

  //time start
  int sHH = 0; int sMM = 0; int sSS = 0;

  //time finish
  int fHH = 0; int fMM = 0; int fSS = 0;

  
  void changeCadence(int newValue)
  {
    cadence = newValue;
  }
  
  void changeDuration(int newValue) 
  {
    duration = newValue;
  }
  
  void changeSessionDuration(int newValue) 
  {
    sessionDuration = newValue;
  }
  
  void changeSpeed(int newValue) 
  {
    speed = newValue; 
  }
  
  void applyBristolType(int newValue) 
  {
    type = newValue;
  }
  
  void buildTime(int newValue) 
  {
  
  }

  void buildDate(int newValue) 
  {
    
  }

  /**
    * this method will handle printing the states of the users sessions
    * 
    */
  void printStates() 
  {
    System.out.println("cadence:" + cadence + " speed:" + speed + " duration:" + duration + 
                       " session duration:" + sessionDuration + " Bristol Stool Type Observed:" + type);
  }
   
  /**
    * this method will handle user login
    * 
    */ 
  void logIn() 
  {
    
  }

  /**
    * this method will handle user account creation
    * 
    */
  void createAccount() 
  {
    
  }

  /**
    * this method handles system generated prompt messages to the user
    * 
    */  
  void promptUser(Boolean newValue, String passedValue) 
  {
    
    Boolean zero = newValue;
    String userSelection = passedValue;
    Boolean one = newValue;
    
    // prompt the user to enter their name
    if ((zero) && (userSelection == null))
    {
      System.out.print("Please Make A Selection(Login or Create?): ");
      
    }
    else
    {
          if ((zero) && (userSelection.equalsIgnoreCase("login")))
          {
              System.out.println("Thanks for the selection, " + userSelection + " login loading...\n");
          }
          else
            if ((zero) && (userSelection.equalsIgnoreCase("create")))
            {
              System.out.println("Thanks for the selection, " + userSelection + " create menu loading...\n");
            }
    }
  }
}