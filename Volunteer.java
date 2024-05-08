/*
 * File Name: Volunteer.java
 *   Created: Feb 15, 2023
 *    Author: 
 */

public class Volunteer extends Employee
{
  public Volunteer(String n)
  {
    super(n);
  }
  @Override
  public String toString()
  {
    String s=super.toString();
    s+="\n.....Pay: Thank you for volunteering!";
    return s;
  }
}
