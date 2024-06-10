package lk.ijse.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Created By Ravindu Prathibha
 * @created 6/10/2024 - 6:43 PM
 * @project Spring_Framework
 */

@Entity
public class Customer {
     @Id
     private
     String id;
     private String name;
     private String address;
     private double salary;

     public Customer() {
     }

     public Customer(String id, String name, String address, double salary) {
          this.setId(id);
          this.setName(name);
          this.setAddress(address);
          this.setSalary(salary);
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public double getSalary() {
          return salary;
     }

     public void setSalary(double salary) {
          this.salary = salary;
     }

     @Override
     public String toString() {
          return "Customer{" +
                  "id='" + id + '\'' +
                  ", name='" + name + '\'' +
                  ", address='" + address + '\'' +
                  ", salary=" + salary +
                  '}';
     }
}
