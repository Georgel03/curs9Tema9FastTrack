package PersonInterface;

import java.time.LocalDate;

public class Programmer extends Employee{

    protected String language;
    public Programmer(String firstName, String lastName, String address, String position, String language) {
        super(firstName, lastName, address, position);
        this.language = language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
