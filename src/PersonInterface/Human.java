package PersonInterface;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Human extends Employee {

    protected String fullName;
    protected long age;
    LocalDateTime currentDate = LocalDateTime.now();


    public Human(String firstName, String lastName, String address, String position) {
        super(firstName, lastName, address, position);
        this.fullName = firstName + " " + lastName;
        this.age = ChronoUnit.YEARS.between(this.getBirthday.toLocalDate(), currentDate.toLocalDate()) - ChronoUnit.YEARS.between(this.getDateOfEmployment().toLocalDate(), currentDate.toLocalDate());

    }

    public long getAge() {
        this.age = ChronoUnit.YEARS.between(this.getBirthday.toLocalDate(), currentDate.toLocalDate()) - ChronoUnit.YEARS.between(this.getDateOfEmployment().toLocalDate(), currentDate.toLocalDate());
        return this.age;
    }

    public String getFullName() {
        this.fullName = firstName + " " + lastName;
        return this.fullName;
    }
}
