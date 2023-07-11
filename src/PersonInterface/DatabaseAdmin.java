package PersonInterface;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee{

    protected String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName, String address, String position,  String dbTechnology) {
        super(firstName, lastName, address, position);
        this.dbTechnology = dbTechnology;
    }

    public void setDbTechnology(String dbTechnology) {
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return this.dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db admin";
    }
}
