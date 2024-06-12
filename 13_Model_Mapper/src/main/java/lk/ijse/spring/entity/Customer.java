package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Created By Ravindu Prathibha
 * @created 6/10/2024 - 6:43 PM
 * @project Spring_Framework
 */
@AllArgsConstructor
@NoArgsConstructor
@Data //Apply Getter|Setter
@Entity
public class Customer {
     @Id
     private String id;
     private String name;
     private String address;
     private double salary;
}
