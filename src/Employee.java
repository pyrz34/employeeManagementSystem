public abstract class Employee implements Workable {
    private String Name ;
    private int id;

    public Employee(String Name, int id){
        this.Name= Name;
        this.id =id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public abstract void calculateSalary();
    @Override
    public void work(){
        System.out.println(Name + " is working");
    }

}
