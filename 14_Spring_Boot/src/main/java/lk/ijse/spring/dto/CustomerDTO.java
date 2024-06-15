package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Created By Ravindu Prathibha
 * @created 6/12/2024 - 2:10 PM
 * @project Spring_Framework
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerDTO {
     private String id;
     private String name;
     private String address;
     private double salary;
}
