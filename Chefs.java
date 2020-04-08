
package resturant.management;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Chefs extends Employee {

    String speciality;
    boolean occupied;
    String currentorder;
    Order order;
    waiter waiterr;

    public Chefs(String speciality, boolean occupied, String currentorder, int id, String firstname, String lastname, String email, Department department, String position, Address adress, Efficiency efficiency) {
        super(id, firstname, lastname, email, department, position, adress, efficiency);
        this.speciality = speciality;
        this.occupied = occupied;
        this.currentorder = currentorder;
    }
    
    public void acceptorder()
    {
          LocalTime time=LocalTime.now();
    DateTimeFormatter timef=DateTimeFormatter.ofPattern("hh:mm:ss");
    String formattime=time.format(timef);
    System.out.println(order.orderid+"has been accept at time"+formattime);
        
    }
    public void processorder()
    {
        System.out.println(order.orderid+"has been processing"); 
    }
    public void finishorder()
    {
        System.out.println(order.orderid+"is finshed & call the waiter"+waiterr.id);
        
    }

    @Override
    public void checkednotification() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
