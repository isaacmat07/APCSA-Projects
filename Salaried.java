/*
 * File Name: Salaried.java
 *   Created: Feb 15, 2023
 *    Author: 
 */

public class Salaried extends Employee
{
  private double pay;
  public Salaried(String n, double p)
  {
    super(n);
    pay=p;
  }
  @Override
  public String toString()
  {
    String s=super.toString();
    s+="\n.....Pay: "+(pay/52);
    return s;
  }
  @Override
  public double getPayAmount()
  {
   return pay/52;
  }
}
