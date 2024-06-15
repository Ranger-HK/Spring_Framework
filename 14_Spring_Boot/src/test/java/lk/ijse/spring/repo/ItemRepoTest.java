package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

/**
 * @Created By Ravindu Prathibha
 * @created 6/11/2024 - 4:16 PM
 * @project Spring_Framework
 */
@SpringBootTest
class ItemRepoTest {

    @Autowired
    ItemRepo itemRepo;

    @Test //Test Method
    public void saveItem() {
        //Ok lets save a item using Item Repo
        Item item1 = new Item("I001", "Apple", 20, 100.0);
        Item item2 = new Item("I002", "Mango", 30, 80.0);
        Item item3 = new Item("I003", "Pineapple", 40, 120.0);

        itemRepo.save(item1);
        itemRepo.save(item2);
        itemRepo.save(item3);

    }


    //get all items list
    @Test
    public void getAllItems() {
        List<Item> all = itemRepo.findAll();
        for (Item item : all) {
            System.out.println(item.toString());
        }
    }

    //Search Item
    @Test
    public void searchItem() {
        Optional<Item> optional = itemRepo.findById("I001");
        boolean present = optional.isPresent();
        System.out.println(present);

        Item item = optional.get();
        System.out.println(item);
    }

    //Delete Item
    @Test
    public void deleteItem() {
        itemRepo.deleteById("I003");
    }

    //Update Item
    @Test
    public void updateItem() {
        Item item3 = new Item("I003", "Pineapple", 40, 120.0);
        itemRepo.save(item3);
    }

}