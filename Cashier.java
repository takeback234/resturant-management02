
package resturantsmanagemento02;


public class Cashier extends Employee {

    public Cashier(String id, String name, float salary, boolean active) {
        super(id, name, salary, active);
    }

    public Cashier(String id, String name, float salary) {
        super(id, name, salary);
    }
   public void takeorder(String s)
   {
       System.out.println(s+"has been taken");
   } 
   public boolean orderfinished (boolean a)
   {
      return a;
   }
   

    @Override
    public void display() {
        System.out.println("display");
    }

    @Override
    public void payment() {
        System.out.println("payment"+super.getSalary());
    }
    
    
}
