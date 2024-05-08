import java.awt.Color;
import java.awt.Graphics;
public class Square extends Rectangle 
{
  private int w2;
  public Square(int x, int y, int w1, Color z)
  {
    super(x,y,w1,w1,z);//calls Rectangle
    w2=w1;
  }
  @Override
  public String getName()
  {
    return "Square";
  }
  @Override
  public void drawOnto(Graphics g)
  {
    super.drawOnto(g);
    g.setColor(super.getColor());
    g.fillRect(super.getX(), super.getY(), w2,w2);
  }
}
