package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Created By Ravindu Prathibha
 * @created 6/11/2024 - 10:40 AM
 * @project Spring_Framework
 */
public interface CustomerRepo extends JpaRepository<Customer,String> {

    //Query Methods Using

    //Find Customer Using Name
    Customer findCustomerByName(String name);

    //Find Customer Using Name -- With out Mention Subject
    Customer findByName(String name);

    //Find Customer Using Address
    Customer findCustomerByAddress(String address);

    //Find Customer Using Name And Address
    Customer findCustomerByNameAndAddress(String name,String address);



}
