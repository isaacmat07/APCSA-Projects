import javax.swing.JTextArea;
import java.util.Scanner;
public class Lab03D extends Object
{ 
  public void updateApp(String data, JTextArea outputArea)
  {
    //Add your code for this lab underneath this line

    Scanner scan = new Scanner(data);
    double x =0;
    double sum=0;
int n=0;
    double s=0;
    double d=0;
    double min=99999999;
    double max=-99999999;
    while (scan.hasNextDouble()==true)
      {

    x= scan.nextDouble();
       sum+=x;
        if(x<=min){
min=x; }
         
          if(x>=max){
            max=x;
          }
        
        n++;
        s+=Math.pow(x,2);
      }
      
    data=data+x;
    d=Math.pow(sum,2);
double sd=Math.sqrt((1.0/(n-1))*(s-((1.0/n)*d)));
    
    outputArea.append("n = "+n);
    outputArea.append("\nsum = "+sum);
    outputArea.append("\nmean = "+(sum/n));
    outputArea.append("\nstd dev = "+(sd));
    outputArea.append("\nminimum = "+(min));
    outputArea.append("\nmaximum = "+(max));
  }

}
