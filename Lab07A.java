import java.util.ArrayList;
import javax.swing.JTextArea;

public class Lab07A extends Object
{
  public void printPayroll(JTextArea out)
  {
    ArrayList<Employee> empList = new ArrayList<>();
        
    empList.add(new Employee("Saujani, Reshma"));
    empList.add(new Employee("Cook, Tim"));
    empList.add(new Volunteer("Gates, Bill"));
    empList.add(new Salaried("Bryant, Kimberly", 663_000.00));
    empList.add(new Hourly("Dorsey, Jack", 15.00));

    Hourly jd=(Hourly)empList.get(4);
    jd.giveRaise(1.25);
    
    
    double totalPayroll = 0;
    int totalHoursWorked = 0;
    for (Employee e : empList)
    {
      e.finalizeWeeklyHours();
      totalPayroll += e.getPayAmount();
      totalHoursWorked += e.getHoursWorked();
      out.append(e.toString() + "\n\n");
    }

    out.append("======================================\n");
    out.append("Total Hours Worked: " + totalHoursWorked + "\n");
    out.append("     Total Payroll: " + totalPayroll + "\n\n");
  }
}