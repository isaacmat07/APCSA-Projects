import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Tulip extends Object
{
private int xval;//instance vars
  private int yval;
  private Color myColor;
  //constructor
  public Tulip(int x,int y, Color c)
  {
    xval=x;//initial values
    yval=y;
    myColor=c;
  }
  @Override
  public String toString()
  {
    String s= "("+xval+", "+yval+") <"+myColor.getRed()+", "+myColor.getGreen()+", "+myColor.getGreen()+">";
    return s;
  }
  public int getX()
  {
    return xval;
  }
  public int getY()
  {
    return yval;
  }
  public Color getColor()
    {
      return myColor;
}
  public void moveTo(int x,int y)
  {
    xval=x;//changes instance x,y to new local explicit params
    yval=y;
  }
  public Image getImage()
  {
    Image canvas = new BufferedImage(50,150, BufferedImage.TYPE_INT_ARGB);
    Graphics g=canvas.getGraphics();
    g.setColor(Color.GREEN);
    g.fillRect(20,100,10,50);
    g.setColor(myColor);
    g.fillArc(0,0,50,100,150,240);
    return canvas;
  }
  public Tulip clone(int x, int y)
  {
   Tulip b=new Tulip(x,y,myColor);
    return b;
  }
  public Tulip combine(Tulip t)//t is 2nd specified Tulip
  {//p.combine(c)
    int x=(this.xval+t.xval)/2;
    int y=(this.yval+t.yval)/2;
    int rAvg=(myColor.getRed()+t.myColor.getRed())/2;
    int gAvg=(myColor.getGreen()+(t.myColor.getGreen()))/2;
    int bAvg=(myColor.getBlue()+(t.myColor.getBlue()))/2;
    Color mix=new Color(rAvg,gAvg,bAvg);
Tulip c=new Tulip(x,y,mix);
    return c;
  }
}