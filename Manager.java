
package resturantsmanagemento02;

public class Manager extends Employee {

    public Manager(String id, String name, float salary, boolean active) {
        super(id, name, salary, active);
    }

    public Manager(String id, String name, float salary) {
        super(id, name, salary);
    }

    @Override
    public void display() {
        System.out.println("display");
    }

    @Override
    public void payment() {
        System.out.println("payment");
    }
    
    public void hire(int id,String neme,float salary)
    {
        
    }
    public int fire(int id)
    {
        return id;
    }
    
    
    
    
    
}
