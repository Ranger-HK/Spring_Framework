package lk.ijse.spring.repo;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @Created By Ravindu Prathibha
 * @created 6/11/2024 - 3:21 PM
 * @project Spring_Framework
 */

@WebAppConfiguration //State test configuration class
@ContextConfiguration(classes = {JPAConfig.class}) //Import configurations for text context
@ExtendWith(SpringExtension.class) //Run with Spring Extension
@Transactional
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo; //Inject the dependency of customer Repo

    @Test //Test Method
    public void saveCustomer() {
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
    public void getAllCustomers() {
        List<Customer> all = customerRepo.findAll();
        for (Customer customer : all) {
            System.out.println(customer.toString());
        }
    }

    //Search Customer
    @Test
    public void searchCustomer() {
        Optional<Customer> optional = customerRepo.findById("C001");
        boolean present = optional.isPresent();
        System.out.println(present);

        Customer customer = optional.get();
        System.out.println(customer);
    }

    //Delete Customer
    @Test
    public void deleteCustomer() {
        customerRepo.deleteById("C003");
    }

    //Update Customer
    public void updateCustomer() {
        Customer customer3 = new Customer("C003", "Nimal", "Colombo", 30000);
        customerRepo.save(customer3);
    }


    @Test
    public void testDTO() {
        CustomerDTO customerDTO = new CustomerDTO("", "", "", 10);
    }


    //Query Methods Using

    //Find Customer Using Name
    @Test
    public void findCustomerByName() {
        Customer ravindu = customerRepo.findCustomerByName("Ravindu");
        System.out.println(ravindu.toString());
    }

    //Find Customer Using Name -- With out Mention Subject
    @Test
    public void findByName() {
        Customer ravindu = customerRepo.findByName("Ravindu");
        System.out.println(ravindu.toString());
    }

    //Find Customer Using Address
    @Test
    public void findCustomerByAddress() {
        Customer ravindu = customerRepo.findCustomerByAddress("Nevada");
        System.out.println(ravindu.toString());
    }

    //Find Customer Using Name And Address
    @Test
    public void findCustomerByNameAndAddress() {
        Customer ravindu = customerRepo.findCustomerByNameAndAddress("Ravindu", "Bandaragama");
        System.out.println(ravindu.toString());
    }

    //Read Customer Using Name
    @Test
    public void readCustomerByName() {
        Customer ravindu = customerRepo.readCustomerByName("Ravindu");
        System.out.println(ravindu.toString());
    }

    //Get Customer Using Name
    @Test
    public void getCustomerByName() {
        Customer ravindu = customerRepo.getCustomerByName("Ravindu");
        System.out.println(ravindu.toString());
    }

    //Query Customer Using Name
    @Test
    public void queryCustomerByName() {
        Customer ravindu = customerRepo.queryCustomerByName("Ravindu");
        System.out.println(ravindu.toString());
    }

   /* //Search Customer Using Name (Return Entity)
    @Test
    public void searchCustomerByName(){
        Customer ravindu = customerRepo.searchCustomerByName("Ravindu");
        System.out.println(ravindu.toString());
    }*/

    //Search Customer List Using Name ( Return List)
    @Test
    public void searchCustomerByName() {
        List<Customer> customers = customerRepo.searchCustomerByName("Ravindu");
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    //Stream Customer Using Name
    @Test
    public void streamCustomerByName() {
        Customer ravindu = customerRepo.streamCustomerByName("Ravindu");
        System.out.println(ravindu.toString());
    }

    //Exist Customer Using Name
    @Test
    public  void textExistBy(){
        boolean b = customerRepo.existsByNameAndAddress("Ravindu","Bandaragama");
        System.out.println(b);
    }

    //Count Customer Using Name
    @Test
    public void testCountBy(){
       long r = customerRepo.countByName("Ravindu");
        System.out.println(r);
    }

    //DeleteBy Customer Using Name
    //Remove Customer Using Name


    //Write Query Manually (MySQL,JPQL,HQL)

    //Native SQL Query Using
    @Test
    public void textQueryMySQL(){
        List<Customer> allCustomers = customerRepo.getAllCustomersWIthMySQL();
        allCustomers.forEach(v->{
            System.out.println(v.toString());
        });
    }

    //JPQL(Java Persistence Query Language ) Query Using
    @Test
    public void textQueryJPQL(){
        List<Customer> allCustomers = customerRepo.getAllCustomersWithJPQL();
        allCustomers.forEach(v->{
            System.out.println(v.toString());
        });
    }

    //HQL Query Using
    @Test
    public void textQueryHQL(){
        List<Customer> allCustomers = customerRepo.getAllCustomersWithHQL();
        allCustomers.forEach(v->{
            System.out.println(v.toString());
        });
    }

    //Handling Parameters

    //Native SQL Query Using with Positional Parameter - One Param
    @Test
    public void textQueryPosition1(){
        Customer customer1 = customerRepo.searchCustomerFormNameOne("Ravindu");
        System.out.println(customer1.toString());
    }


    //Native SQL Query Using with Positional Parameter - Two Param
    @Test
    public void textQueryPosition2(){
        Customer customer2 = customerRepo.searchCustomerFormNameTwo("Ravindu","Kamal");
        System.out.println(customer2.toString());
    }


    //Native SQL Query Using with Named Parameter with @Param
    @Test
    public void textQueryParam(){
        Customer customer3 = customerRepo.searchCustomerFormNameWithParam("Ravindu","Bandaragama");
        System.out.println(customer3.toString());
    }

    //Paging Using
    //page - page number start with 0
    //size - count of records for a  page
    @Test
    public void checkPageableFeatures(){
        PageRequest pr = PageRequest.of(0, 3);
        Page<Customer> all = customerRepo.findAll(pr);
        all.forEach(v->{
            System.out.println(v.toString());
        });
    }

    //Sort Using
    //page - page number start with 0
    //size - count of records for a  page
    //sort by - sorting to attribute
    //,descending - order to sort
    @Test
    public void checkPageableFeature(){
        PageRequest pr = PageRequest.of(0, 3, Sort.by("id").descending());
        Page<Customer> all = customerRepo.findAll(pr);
        all.forEach(v->{
            System.out.println(v.toString());
        });
    }

}