package PersonInterface;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.random.RandomGenerator;
public class Employee implements Person {

    protected String firstName;

    protected String lastName;

    protected LocalDateTime getBirthday;

    protected String address;

    protected LocalDateTime dateOfEmployment;

    protected String position;

    Random random = new Random();
    public Employee(String firstName, String lastName, String address, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.getBirthday = LocalDateTime.now().minusYears(random.nextInt(5, 100));
        this.address = address;
        this.dateOfEmployment = LocalDateTime.now().minusDays(5);
        this.position = position;

    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setBirthday() {
        this.getBirthday = LocalDateTime.now().minusYears(18);
    }

    public LocalDateTime getBirthday() {
        return this.getBirthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setDateOfEmployment() {
        this.dateOfEmployment = LocalDateTime.now();
    }

    public LocalDateTime getDateOfEmployment() {
        return this.dateOfEmployment;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }


}
