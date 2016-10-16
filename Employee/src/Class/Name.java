/**
 * Classname: Name.class
 *
 * Version: 1.0
 *
 * Date: oct 03,2016
 *
 * Copyright Rajan Subedi
 *
 * Name: Rajan Subedi
 *
 * ID: 104404788
 */
package Class;
import java.util.StringTokenizer;
public class Name {

    private String firstName = null; // First Name
    private String middleName = null; // Middle NAme
    private String lastName = null; // Last Name

    /*Description:A constructor that takes the full name of a person as its argument of the String
      class by using StringTokenizer to extract different components of the name.
      Input: Name takes string as input.
      Output: Creates new Name Object.
     */
    public Name(String name){
        String pattern1 = "([A-Z][A-Za-z]*\\s+([A-Z][a-z]+))"; // Pattern: First, Last
        String pattern2 = "([A-Z][A-Za-z]*\\s+[A-Z][a-z]*\\s+[A-Z][a-z]*)";  // Pattern: First,Middle,Last
        StringTokenizer n_Token  = new StringTokenizer(name," "); // date token
        // Pattern: First, Last
        if(name.matches(pattern1)){
            while (n_Token.hasMoreTokens()) {
                this.firstName = n_Token.nextElement().toString();
                this.middleName = null; // no middle name
                this.lastName = n_Token.nextElement().toString();

            }
        }
        // Pattern: First,Middle,Last
        if(name.matches(pattern2)){
            while (n_Token.hasMoreTokens()) {
                this.firstName = n_Token.nextElement().toString();
                this.middleName = n_Token.nextElement().toString();
                this.lastName = n_Token.nextElement().toString();

            }
        }
    }

    /*Copy constructor.*/
    Name(Name name){
        firstName = name.firstName; // sets first name
        middleName   = name.middleName; // sets middle name
        lastName  = name.lastName; // sets last name
    }
    /*
    * Description: A setName method which takes a new first name, middle name and last name and stores
    * these values in the instance variables firstName, middleName and lastName.
    */
    public void setName(String FirstName,String MiddleName,String LastName){
        this.firstName = FirstName; // sets first name
        this.lastName = LastName;   //sets last name
        this.middleName = MiddleName; // sets middle name
    }

    /*
    Description:toString returns an object of the String class.
    Input: Takes no input.
    Output: Returns an String object.
    */
    public String toString(){
        String s_Name;
        if(middleName != null){
            s_Name = firstName + " " + middleName + " "+ lastName;
        }
        else{
            s_Name = firstName + " " +lastName;
        }
        return s_Name;
    }
}
