package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
    boolean existsByNameAndAddress(String name, String address);

    //Count Customer Using Name
    long countByName(String name);

    //DeleteBy Customer Using Name
    //Remove Customer Using Name



    //Write Query Manually (MySQL,JPQL,HQL)

    //Native SQL Query Using
    @Query(value = "select * from Customer",nativeQuery = true)
    List<Customer> getAllCustomersWIthMySQL();

    //JPQL(Java Persistence Query Language ) Query Using
    @Query(value = "select c from Customer c")
    List<Customer> getAllCustomersWithJPQL();

    //HQL Query Using
    @Query(value = "from Customer c")
    List<Customer> getAllCustomersWithHQL();



    //Handling Parameters
   // 1)Positional Parameter
   // 2)Named Parameter with @Param

    //Native SQL Query Using with Positional Parameter - One Param
    @Query(value = "select * from Customer where name=?1",nativeQuery = true)
    Customer searchCustomerFormNameOne(String name);

    //Native SQL Query Using with Positional Parameter - Two Param
    @Query(value = "select * from Customer where name=?1 and address=?2",nativeQuery = true)
    Customer searchCustomerFormNameTwo(String name,String address);

    //Native SQL Query Using with Named Parameter with @Param
    @Query(value = "select * from Customer where name=:name and address=:address",nativeQuery = true)
    Customer searchCustomerFormNameWithParam(@Param("name")  String name, @Param("address") String address);



}
