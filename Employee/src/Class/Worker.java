/**
 * Classname: Worker.class
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
public class Worker {

    private static int howManyWorkers = 0;  // Workers
    private static int id = 0;              // Id counter
    private int workerNumber;               // Worker id
    private Name  workerName;               // Worker Name
    private MyDate dateJoiningCompany;      // Date joined
    private double Salary;                  // Worker Salary
    private Worker Supervisor = null;       // Worker Supervisor
    /*
      Description:Worker is a constructor that takes the full name of a person, starting date, and the salary and creates  a new object.
      Input:Worker takes two string w_Name,String w_date, and double w_Sal.
      Output: Creates new Worker Object.
      */
    public Worker(String w_Name, String w_date,double w_Sal){
        this.workerName = new Name(w_Name);
        this.dateJoiningCompany = new MyDate(w_date);
        this.Salary = w_Sal;
        id++;
        this.workerNumber = id;
        howManyWorkers += 1;
    }
    /*
      Description:Worker is a constructor that takes the full name of a person, and the starting date and creates  a new object
      Input:Worker takes two string w_Name, and String w_date.
      Output:Creates new Worker Object.
      */
    public Worker(String w_Name, String w_date){
        this.workerName = new Name(w_Name);
        this.dateJoiningCompany = new MyDate(w_date);
        this.Salary = 0.00;
        id++;
        this.workerNumber = id;
        howManyWorkers += 1;
    }

    Worker(Worker worker){
        workerName = worker.workerName;
        dateJoiningCompany = worker.dateJoiningCompany;
        Salary = worker.Salary;
    }

    /*
    Description: setSalary when invoked, should change the salary to the supplied value
    Input:setSalary takes an argument of type double, representing the new salary of the employee.
    Output:setSalary change the salary to the supplied value.
    */

    public void setSalary(double set_Sal){
        this.Salary = set_Sal;
    }
    /*
     Description:setSupervisor when invoked, should change the Supervisor's name to the supplied name.
     Input: setSupervisor takes an argument of type double,representing the new supervisor of the employee.
     Output: setSupervisor change the Supervisor's name to the supplied name
     */

    public void setSupervisor(Worker set_Supervisor){
        this.Supervisor = set_Supervisor;
    }

    /*
      Description: getHowManyWorkers checks number of worker objects.
      Input: getHowManyWorkers takes no input.
      Output: getHowManyWorkers returns howManyWorkers we have created
      */
    public static int getHowManyWorkers(){
        return howManyWorkers;
    }

    /*
      Description: getSupervisorName will retrieve the name of the supervisor of the worker as an object of the Name class
      Input: getSupervisorName takes no input.
      Output:getSupervisorName returns supervisor of the worker as an object of the Name class
      */
    public Name getSupervisorName(){
        return this.Supervisor.workerName;
    }
    /*
      Description: toString returns the information about the worker in the form of a string.
      Input: toString takes no input.
      Output: toString returns information about the worker as an string object..
      */
    public String toString(){
        String s_V ="";

        // Checks if the worker has a supervisor.
        if(this.Supervisor ==null){
             s_V = "Has no supervisor";
        }
        else{
            s_V = this.Supervisor.workerName.toString();
        }
        final int workerNumber = this.workerNumber;

        return ("\nWorker Number # "+ workerNumber + " " + workerName.toString()
                +"\nJoined the company on: "+ dateJoiningCompany.toString()
                +"\nSupervisor: " + s_V
                +"\nSalary is $"+ Salary+"0");
    }

}
