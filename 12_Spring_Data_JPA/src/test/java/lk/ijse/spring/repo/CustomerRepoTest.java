package lk.ijse.spring.repo;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Created By Ravindu Prathibha
 * @created 6/11/2024 - 3:21 PM
 * @project Spring_Framework
 */

@WebAppConfiguration
@ContextConfiguration(classes = {JPAConfig.class})
@ExtendWith(SpringExtension.class)
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;

    @Test
    public void saveCustomer(){
       Customer customer1 = new Customer("C001", "Ravindu", "Bandaragama", 100000);
       Customer customer2 = new Customer("C002", "Kamal", "Panadura", 20000);
       Customer customer3 =new Customer("C003", "Nimal", "Colombo", 30000);

       customerRepo.save(customer1);
       customerRepo.save(customer2);
       customerRepo.save(customer3);
    }

}