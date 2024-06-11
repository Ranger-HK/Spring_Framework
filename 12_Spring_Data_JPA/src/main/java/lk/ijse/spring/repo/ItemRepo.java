package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Created By Ravindu Prathibha
 * @created 6/11/2024 - 11:00 AM
 * @project Spring_Framework
 */
public interface ItemRepo extends JpaRepository<Item,String> {

}
