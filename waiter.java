
package resturant.management;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class waiter extends Employee {

int floorno;
boolean currentlyserving;
int digitizerno;

    public waiter(int floorno, boolean currentlyserving,int digitizerno, int id, String firstname, String lastname, String email, Department department, String position, Address adress, Efficiency efficiency) {
        super(id, firstname, lastname, email, department, position, adress, efficiency);
        this.floorno = floorno;
        this.currentlyserving = currentlyserving;
        this.digitizerno=digitizerno;
    }

public void deliverfood()
{
      LocalTime time=LocalTime.now();
    DateTimeFormatter timef=DateTimeFormatter.ofPattern("hh:mm:ss");
    String formattime=time.format(timef);
    System.out.println("Delivered Time:"+formattime);
    
}

    @Override
    public void checkednotification() {
        
    }



  

    


}
  