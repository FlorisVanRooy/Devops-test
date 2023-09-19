package fact.it.examcustomercheck.model;

public class Customer {
    private String name;
    private Boolean citizen;
    private int yearOfRegistration;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isCitizen() {
        return citizen;
    }

    public void setCitizen(Boolean citizen) {
        this.citizen = citizen;
    }

    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    @Override
    public String toString() {
        String citizen = "";
        if (this.isCitizen() != null) {
            if (this.isCitizen() == true) {
                citizen = " (citizen)";
            }
        }

        return this.getName() + citizen + " registered in " + getYearOfRegistration();
    }
}
