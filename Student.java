package student;
 

 class Student
{
    // the private data members
    private int IDnumber;
    private int hours;
    private int points;
 
    // constructor added in last part of project
    Student()
    {
        IDnumber = 9999;
        points = 12;
        hours = 3;
    }
    // end of constructor
 
    // the public get and set methods
    public void setIDnumber(int number)
    {
        IDnumber = number;
    }
 
 
    public int getPoints()
    {
        return points;
    }
 
    // methods to display the fields
    public void showIDnumber()
    {
        System.out.println("ID Number is: " + IDnumber);
    }
 
    public void showHours()
    {
        System.out.println("Credit Hours: " + hours);
    }
 
    public void showPoints()
    {
        System.out.println("Points Earned: " + points);
    }
 
    public double getGradePoint()
    {
        return (double)points / hours;
    }
 
}