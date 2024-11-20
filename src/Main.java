
public class Main {
    public static void main(String[] args) {
        Employee manager =new Manager("Ali",101,5000);
        Employee developer= new Developer("Ayşe",102,"Java");

        manager.work();
        manager.calculateSalary();

        developer.work();
        developer.calculateSalary();

        System.out.println("Manager Name :"+manager.getName());
        System.out.println("Developer Programming Language: " + ((Developer) developer).getProgrammingLanguage());

    }
}