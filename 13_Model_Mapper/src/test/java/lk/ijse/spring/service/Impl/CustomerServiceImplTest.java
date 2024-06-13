package lk.ijse.spring.service.Impl;

import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Created By Ravindu Prathibha
 * @created 6/13/2024 - 1:52 PM
 * @project Spring_Framework
 */
@WebAppConfiguration //State test configuration class
@ContextConfiguration(classes = {WebAppConfig.class}) //Import configurations for text context
@ExtendWith(SpringExtension.class) //Run with Spring Extension
@Transactional //Data Not Added data Base After Using This Annotation
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService; //Inject the Dependency Customer Service

    public CustomerDTO addTestCustomer() {
        return new CustomerDTO("C001", "Kamal", "Kaluthara", 100);
    }

    @Test
    void getAllCustomers() {

      /*  //If is a new customer it should be added to the database
        CustomerDTO customerDTO1 = new CustomerDTO("C001", "Kamal", "Kaluthara", 100);
        customerService.saveCustomer(customerDTO1);*/

        //If is a new customer it should be added to the database
        CustomerDTO customerDTO1 = addTestCustomer();


        //Assertion Method Using --> Can't Throw the Error
        assertDoesNotThrow(() -> {
            customerService.saveCustomer(customerDTO1);
        });


       /* // If the customer already exist check if it is throwing exception/error
        CustomerDTO customerDTO2 = new CustomerDTO("C001", "Kamal", "Kaluthara", 100);
        customerService.saveCustomer(customerDTO2);*/

        // If the customer already exist check if it is throwing exception/error
        CustomerDTO customerDTO2 = addTestCustomer();

        //Assertion Method Using --> Must be Throw the Error
        assertThrows(RuntimeException.class, () -> {
            customerService.saveCustomer(customerDTO2);
        });

    }

    @Test
    void saveCustomer() {
    }

    @Test
    void deleteCustomer() {
    }

    @Test
    void updateCustomer() {
    }

    @Test
    void searchCustomer() {

        //add customer
        CustomerDTO customerDTO1 = addTestCustomer();
        customerService.saveCustomer(customerDTO1);

        CustomerDTO c001 = customerService.searchCustomer("C001");

        assertNotNull(c001);//Check Data Null or Not


        //Assertion Method Using --> Must be Throw the Error
        assertThrows(RuntimeException.class, () -> {
            customerService.searchCustomer("C001");
        });

        //Assertion Method Using --> Can't Throw the Error
        assertDoesNotThrow(() -> {
            customerService.searchCustomer("C001");
        });
    }
}