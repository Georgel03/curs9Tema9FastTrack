package PersonInterface;

public class Main {

    public static void main(String[] args) {

       Human employee = new Human("Stance", "George", "Alesd", "Engineer");
        System.out.println(String.format("The name of the employeer is %s", employee.getFullName()));
        System.out.println("The employeer has " + employee.getAge() + " years old!");
        employee.setBirthday();
        employee.setPosition("Programmer");
        System.out.println(String.format("%s is a %s", employee.getFullName(), employee.getPosition()));
        DatabaseAdmin worker = new DatabaseAdmin("Ardelean", "Alex", "Oradea", "Senior", "SQL");
        System.out.println(worker.dbTechnology);
        worker.setDbTechnology("NO-SQL");
        System.out.println(String.format("%s is a %s, and he/she was employeed", worker.firstName + " " + worker.lastName, worker.position) + " in " + employee.dateOfEmployment);
    }
}
