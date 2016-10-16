/**
 * Classname: MyDate.class
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
public class MyDate {

    private int md_Day; // Day
    private int md_Month; // month
    private int md_Year; //year

    /*
     * Description: MyDate This will make  an new object of class MyDate.
     * Input: MyDate takes one input date_String as String.
     * Output: MyDate hs no return type
     */
    public MyDate(String date_String){
        StringTokenizer d_Token  = new StringTokenizer(date_String,"/"); // date token
        while (d_Token.hasMoreTokens()) {
            this.md_Day = Integer.parseInt(d_Token.nextToken());
            this.md_Month = Integer.parseInt(d_Token.nextToken());
            this.md_Year = Integer.parseInt((d_Token.nextToken()).substring(2)); //last two chars

        }
    }
    /*
     * Description: MyDate This will take an object of class MyDate and return a new object with the same day month and year.
     * Input: MyDate takes one input date_String as String.
     * Output: MyDate returns a new object with the same day month and year.
     */
    MyDate(MyDate date){
        md_Day   = date.md_Day;
        md_Month = date.md_Day;
        md_Year  = date.md_Year;
    }

    /*
     * Description: toString will covert the objects into a string.
     * Input: toString takes no input
     * Output: toString returns a String Date.
     */
    public String toString(){
        String  Date;
        String monthName = "";
        switch(md_Month){
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                break;
        }

        if(md_Year == 0){
            Date = monthName+ " " +md_Day+", '00";
        }
        else if((md_Year>0) && (md_Year<10)){
            Date = monthName+ " " +md_Day+", '0"+md_Year;
        }
        else{
            Date = monthName+ " " +md_Day+", '"+md_Year;
        }

        return Date;
    }

    /*
     * Description: If the date stored in the current object corresponds to a
     * date earlier than that represented by the argument, the method should
     * return true. Otherwise, the method should return false.
     *
     * Input: lessThan takes a MyData lt_Date.
     * Output: lessThan returns a boolean value.
     */
    public boolean lessThan( MyDate lt_Date){
        boolean stat = true;
        double time1;
        double time2;
        // converts the date into minutes and compares the two times.
        time1 = ((730.001*this.md_Month)+(24*this.md_Day)+(8760*this.md_Year));
        time2 = ((730.001*lt_Date.md_Month)+(24*lt_Date.md_Day)+(8760*lt_Date.md_Year));

        if(time1 >time2){
            stat = false;
        }
        return stat;
    }
    /*
      * Description: A method equals which has a parameter of class MyDate.
      * The method returns true if the argument corresponds to the same day,
      * month and year. Otherwise it returns false.
      *
      * Input: lessThan takes a MyData eq_date.
      * Output: lessThan returns a boolean value.
      */
    public boolean equals (MyDate eq_date){
        boolean stat = false;
        if ((this.md_Day == eq_date.md_Day) &&(this.md_Month == eq_date.md_Month)&&(this.md_Year == eq_date.md_Year)) {
            stat = true;
        }
        return stat;
    }
}
