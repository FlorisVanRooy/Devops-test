package fact.it.examcustomercheck;

import fact.it.examcustomercheck.model.Customer;
import fact.it.examcustomercheck.model.Visit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.exit;

@SpringBootApplication
public class ExamCustomerCheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamCustomerCheckApplication.class, args);

        Customer customer1 = new Customer("John Doe");
        customer1.setCitizen(true);
        customer1.setYearOfRegistration(2014);

        Visit visit1 = new Visit();
        visit1.setCustomer(customer1);
        visit1.setEnterWeight(1215);
        visit1.setExitWeight(1210);

        Customer customer2 = new Customer("Jane Smith");
        customer2.setYearOfRegistration(2015);

        Visit visit2 = new Visit();
        visit2.setCustomer(customer2);
        visit2.setEnterWeight(1422);
        visit2.setExitWeight(1411);

        System.out.println("Visit 1 Details:");
        System.out.println(visit1.toString());
        System.out.println("Visit 2 Details:");
        System.out.println(visit2.toString());

    }



}
