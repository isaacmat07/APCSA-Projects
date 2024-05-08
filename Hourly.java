/*
 * File Name: Hourly.java
 *   Created: Feb 15, 2023
 *    Author: 
 */

public class Hourly extends Employee
{
  private double rate;
  public Hourly(String n, double p)
  {
    super(n);
   rate=p;
}
  @Override
  public String toString()
  {
    String s=super.toString();
    s+="\n....Rate: "+rate+"\n.....Pay: "+(rate*super.getHoursWorked());
    return s;
  }
  @Override
  public double getPayAmount()
  {
    return rate*super.getHoursWorked();
  }
  public void giveRaise(double amount)
  {
    rate+=amount;
    
  }
}