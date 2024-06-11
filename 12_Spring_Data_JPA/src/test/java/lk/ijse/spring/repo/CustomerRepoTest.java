package lk.ijse.spring.repo;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Created By Ravindu Prathibha
 * @created 6/11/2024 - 3:21 PM
 * @project Spring_Framework
 */

@WebAppConfiguration //State test configuration class
@ContextConfiguration(classes = {JPAConfig.class}) //Import configurations for text context
@ExtendWith(SpringExtension.class) //Run with Spring Extension
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo; //Inject the dependency of customer Repo

    @Test //Test Method
    public void saveCustomer(){
        //Ok lets save a customer using Customer Repo
       Customer customer1 = new Customer("C001", "Ravindu", "Bandaragama", 100000);
       Customer customer2 = new Customer("C002", "Kamal", "Panadura", 20000);
       Customer customer3 = new Customer("C003", "Nimal", "Colombo", 30000);

       customerRepo.save(customer1);
       customerRepo.save(customer2);
       customerRepo.save(customer3);
    }


    //get all customer list
    @Test
    public void getAllCustomers(){
        List<Customer>all=customerRepo.findAll();
        for (Customer customer : all) {
            System.out.println(customer.toString());
        }
    }

    //Search Customer
    @Test
    public void searchCustomer(){
        Optional<Customer>optional=customerRepo.findById("C001");
        boolean present = optional.isPresent();
        System.out.println(present);

        Customer customer = optional.get();
        System.out.println(customer.toString());
    }

}