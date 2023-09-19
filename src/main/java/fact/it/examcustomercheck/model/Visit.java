package fact.it.examcustomercheck.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDate.now;

public class Visit {
    private int enterWeight;
    private int exitWeight;
    private Customer customer;

    public Visit() {
    }

    public int getEnterWeight() {
        return enterWeight;
    }

    public void setEnterWeight(int enterWeight) {
        this.enterWeight = enterWeight;
    }

    public int getExitWeight() {
        return exitWeight;
    }

    public void setExitWeight(int exitWeight) {
        this.exitWeight = exitWeight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getDepositedWeight() {
        return this.enterWeight - this.exitWeight;
    }

    public int getMembershipAge() {
        return LocalDate.now().getYear() - this.getCustomer().getYearOfRegistration();
    }

    public int getCost() {
        if (this.getDepositedWeight() <= 7 && this.getMembershipAge() > 5) {
            return 0;
        }
        else if (this.getDepositedWeight() <= 50) {
            return this.getDepositedWeight() * 2;
        }
        else {
            return this.getDepositedWeight() * 3;
        }
    }

    @Override
    public String toString() {
        return getCustomer().toString() + " has deposited " + this.getDepositedWeight() + "kg. of waste: Cost = " + this.getCost() + " euro.";
    }
}
