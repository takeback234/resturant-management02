
package resturantsmanagemento02;

public class Chefs extends Employee {
    
     private int hours;
    private int days;

    public Chefs(int hours, int days, String id, String name, float salary, boolean active) {
        super(id, name, salary, active);
        this.hours = hours;
        this.days = days;
    }

    public Chefs(int hours, int days, String id, String name, float salary) {
        super(id, name, salary);
        this.hours = hours;
        this.days = days;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
    

    @Override
    public void display() {
        System.out.println("Id:"+super.getId());
        System.out.println("Works per week:"+hours*7);
    }

    @Override
    public void payment() {
        System.out.println("Salary:"+super.getSalary());
    }
    
    
    
}
