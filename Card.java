import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * File Name: Card.java
 *   Created: Oct 12, 2022
 *    Author: 
 */

public class Card extends Object
{
  private String suit;
  private int value, xval, yval;
  public static Image getCardBack()
  {
    return ALL_CARDS.getSubimage(0, 0, CARD_WIDTH, CARD_HEIGHT);
  }
public Card (String s, int v)
  {
    suit=s;
    value=v;
    xval=0;
    yval=0;
  }
  public Card()
  {
    suit="j";
    value=0;
    xval=0;
    yval=0;
  }
public Image getImage()
  {
    int y;
    int x=value*CARD_WIDTH;
   if(suit.equals("c")){
      y=0;
   }
else if(suit.equals("d")){
         y=CARD_HEIGHT;
      }
    else if(suit.equals("h")){
       y=2*CARD_HEIGHT;
    }
    else{ 
       y=3*CARD_HEIGHT;}
   int w=CARD_WIDTH;
     int h=CARD_HEIGHT;
    return ALL_CARDS.getSubimage(x,y,w,h);
  }
public void setXY(int x, int y)
  {
    xval=x;
    yval=y;
  }
  public int getX()
  {
    return xval;
  }
  public int getY()
  {
    return yval;
  }
  public int getValue()
  {
    return value;
  }
  public String toString()
  {
    return (suit+" "+value+" ("+xval+", "+yval+")");
  }
public boolean contains(int x, int y)
  {
    if(x>=this.getX()&&x<=(this.getX()+CARD_WIDTH)&&y>=this.getY()&&y<=(this.getY()+CARD_HEIGHT))return true;
    else return false;
  }
public int valueDifference(Card c)
  {
    if(this.getValue()==0||c.getValue()==0) return 1;
   else if((this.getValue()==13&&c.getValue()==1)||((this.getValue()==1&&c.getValue()==13)))
           {return 1;}
    else return Math.abs(this.getValue()-c.getValue());
  }






  
  /////////////////////////////////////////////////////////
  //
  //  Do not modify or add code beneath this point
  //
  /////////////////////////////////////////////////////////
  //This block of code initializes the Card class 
  //static variables (do not modify)
  
  private static final BufferedImage ALL_CARDS;
  public static final int CARD_WIDTH;
  public static final int CARD_HEIGHT;
  static
  {
    BufferedImage temp = null;
    try 
    {
      temp = ImageIO.read(Card.class.getResource("cards.png"));
    }
    catch (IOException e) 
    {
      //Could not load cards.png: end app with an error message.
      e.printStackTrace();
      System.exit(-1);
    }
    ALL_CARDS = temp;
    if (temp != null)
    {
      CARD_WIDTH = temp.getWidth() / 14;
      CARD_HEIGHT = temp.getHeight() / 4;
    }
    else
    {
      CARD_WIDTH = 0;
      CARD_HEIGHT = 0;
    }
  }

  
}
