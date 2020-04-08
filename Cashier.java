
package resturant.management;

public class Cashier extends Employee {
    
    int terminalno;
    int sesssionno;
    Order order;

    public Cashier(int terminalno, int sesssionno, int id, String firstname, String lastname, String email, Department department, String position, Address adress, Efficiency efficiency) {
        super(id, firstname, lastname, email, department, position, adress, efficiency);
        this.terminalno = terminalno;
        this.sesssionno = sesssionno;
    }
    
    public void takeorder(Order order)
    {
        System.out.println("Order id:"+order.orderid);
        System.out.println("Customer id:"+order.customerid);
    }
    public double calculation(int quantity,double perprice )
    {
        double price=quantity*perprice;
        return price;
    }
    
    public void bill(double price)
    {
        if(price>1000)
        {
           double discount=price*(10.0/100);
           double Price=price-discount;
            System.out.println("your bill is="+Price);
        }
        else if(price>2000)
        {
            double discount=price*(15.0/100);
            double Price=price-discount;
            System.out.println("your bill is="+Price);
        }
    }


    @Override
    public void checkednotification() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
