package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Created By Ravindu Prathibha
 * @created 6/11/2024 - 10:40 AM
 * @project Spring_Framework
 */
public interface CustomerRepo extends JpaRepository<Customer, String> {

    //Query Methods Using

    //KEYWORDS --->>> 10 Keywords Have

    //findBy
    //readBy
    //getBY         --->>  Return One Entity Or List
    //queryBy
    //searchBy
    //streamBy


    //existBy -->boolean
    //CountBy --> number    --->>     Return boolean and number

    //deleteBy          ---->>>  No Return Type (Void Type)
    //removeBy


    //Find Customer Using Name
    Customer findCustomerByName(String name);

    //Find Customer Using Name -- With out Mention Subject
    Customer findByName(String name);

    //Find Customer Using Address
    Customer findCustomerByAddress(String address);

    //Find Customer Using Name And Address
    Customer findCustomerByNameAndAddress(String name, String address);

    //Read Customer Using Name
    Customer readCustomerByName(String name);

    //Get Customer Using Name
    Customer getCustomerByName(String name);

    //Query Customer Using Name
    Customer queryCustomerByName(String name);

   /* //Search Customer Using Name (Return Entity)
    Customer searchCustomerByName(String name);*/

    //Search Customer List Using Name ( Return List)
    List<Customer> searchCustomerByName(String name);

    //Stream Customer Using Name
    Customer streamCustomerByName(String name);

    //Exist Customer Using Name

    //Count Customer Using Name

    //DeleteBy Customer Using Name

    //Remove Customer Using Name


}
