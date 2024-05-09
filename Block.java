/*
 * File Name: Block.java
 *   Created: Oct 06, 2022
 *    Author: 
 */

public class Block extends Object
{
  private double mass;
  private double xval;
  private double vel;
  private int sW;
  private static final int BLOCK_WIDTH=50;
  //constructor
  public Block(double m,double x,double v, int w)
  {
    mass=m;//initial values
    xval=x;
    vel=v;
    sW=w;
  }
    public double getMass()
      {
        return mass;
      }
      public double getX()
      {
        return xval;
      }
      public double getVelocity()
        {
          return vel;
    }
    public int getBlockWidth()
      {
      return BLOCK_WIDTH;
      } 
    public double getEnergy()
      {
      return (1.0)/2*mass*Math.pow(vel,2.0);
      }
  @Override
  public String toString()
  {
    return String.format("m = %6.1f  x=%6.1f  v=%6.1f  E =%10.1f", mass, xval, vel, this.getEnergy());
  }
  public void move(double timeIncrement)
  {
    xval+=(vel*timeIncrement);
    if(xval+BLOCK_WIDTH>sW||xval<0)
    {
    vel*=-1;
    }
   
  }
  public void checkCollision(Block other)
  {
    if(Math.abs(this.xval-other.xval)<=BLOCK_WIDTH)
    {
    double v1=this.getVelocity();
     double v2=other.getVelocity();

      this.vel=(v1*(this.mass-other.mass)+2*other.mass*v2)/(this.mass+other.mass);
      other.vel=(v2*(other.mass-this.mass)+2*this.mass*v1)/(this.mass+other.mass);
    }
  }
  }
