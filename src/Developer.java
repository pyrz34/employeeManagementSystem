public class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String Name,int id,String programmingLanguage){
        super(Name,id);
        this.programmingLanguage=programmingLanguage;
    }
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    public void calculateSalary(){
        System.out.println("Developer 's salary is calculated based on programming expertise in" + programmingLanguage);

    }

}
