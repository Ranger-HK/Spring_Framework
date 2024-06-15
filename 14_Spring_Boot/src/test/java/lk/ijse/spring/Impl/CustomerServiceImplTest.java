package lk.ijse.spring.Impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Created By Ravindu Prathibha
 * @created 6/13/2024 - 1:52 PM
 * @project Spring_Framework
 */
@SpringBootTest
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService; //Inject the Dependency Customer Service

    //Add One Customer for Testing
    public CustomerDTO addTestCustomer() {
        return new CustomerDTO("C001", "Kamal", "Kaluthara", 100);
    }

    //Add Multiple Customer for Testing
    public void addCustomers() {
        CustomerDTO c1 = new CustomerDTO("C001", "Kamal", "Kaluthara", 100);
        CustomerDTO c2 = new CustomerDTO("C002", "Amal", "Bagama", 200);
        CustomerDTO c3 = new CustomerDTO("C003", "Nimal", "Hagama", 300);
        CustomerDTO c4 = new CustomerDTO("C004", "Dumal", "Godagama", 400);
        customerService.saveCustomer(c1);
        customerService.saveCustomer(c2);
        customerService.saveCustomer(c3);
        customerService.saveCustomer(c4);

    }

    @Test
    void getAllCustomers() {

        //Add multiple customers
        addCustomers();

        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        for (CustomerDTO allCustomer : allCustomers) {
            System.out.println(allCustomer.toString());
        }

        //Test Customer availability
        assertNotNull(allCustomers);
    }


    @Test
    void saveCustomer() {

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
    void deleteCustomer() {
        //Add Customer Multiple
        addCustomers();

        //Delete an Existing Customer
        //Assertion Method Using --> Can't Throw the Error
        assertDoesNotThrow(() -> {
            customerService.deleteCustomer("C001");
        });


        //Delete an Not Existing Customer
        //Assertion Method Using --> Must be Throw the Error
        assertThrows(RuntimeException.class, () -> {
            customerService.deleteCustomer("C011");
        });

    }

    @Test
    void updateCustomer() {
        //Add Customer Multiple
        addCustomers();

        //Update an Existing Customer
        //Assertion Method Using --> Can't Throw the Error
        assertDoesNotThrow(() -> {
            customerService.updateCustomer(new CustomerDTO("C001", "Kamal", "Kaluthara", 500));
        });


        //Update an Not Existing Customer
        //Assertion Method Using --> Must be Throw the Error
        assertThrows(RuntimeException.class, () -> {
            customerService.updateCustomer(new CustomerDTO("C011", "Kamal", "Kaluthara", 500));
        });


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