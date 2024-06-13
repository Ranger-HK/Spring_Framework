package lk.ijse.spring.service.Impl;

import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Created By Ravindu Prathibha
 * @created 6/13/2024 - 1:52 PM
 * @project Spring_Framework
 */
@WebAppConfiguration //State test configuration class
@ContextConfiguration(classes = {WebAppConfig.class}) //Import configurations for text context
@ExtendWith(SpringExtension.class) //Run with Spring Extension
@Transactional
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;

    @Test
    void getAllCustomers() {

        //If is a new customer it should be added to the database
        CustomerDTO customerDTO1 = new CustomerDTO("C001", "Kamal", "Kaluthara", 100);
        customerService.saveCustomer(customerDTO1);

        //Assertion Method Using --> Can't Throw the Error
        assertDoesNotThrow(()->{
            customerService.saveCustomer(customerDTO1);
        });

        // If the customer already exist check if it is throwing exception/error
        CustomerDTO customerDTO2 = new CustomerDTO("C001", "Kamal", "Kaluthara", 100);
        customerService.saveCustomer(customerDTO2);

        //Assertion Method Using --> Must be Throw the Error
        assertThrows(RuntimeException.class,()->{
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
    }
}