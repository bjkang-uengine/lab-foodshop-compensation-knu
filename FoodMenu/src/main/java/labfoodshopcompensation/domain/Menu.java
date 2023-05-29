package labfoodshopcompensation.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import labfoodshopcompensation.FoodMenuApplication;
import lombok.Data;

@Entity
@Table(name = "Menu_table")
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long qty;

    @PostPersist
    public void onPostPersist() {}

    public static MenuRepository repository() {
        MenuRepository menuRepository = FoodMenuApplication.applicationContext.getBean(
            MenuRepository.class
        );
        return menuRepository;
    }

    public static void decreaseQty(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        Menu menu = new Menu();
        repository().save(menu);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(menu->{
            
            menu // do something
            repository().save(menu);


         });
        */

    }

    public static void increaseQty(OrderCancelled orderCancelled) {
        /** Example 1:  new item 
        Menu menu = new Menu();
        repository().save(menu);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(menu->{
            
            menu // do something
            repository().save(menu);


         });
        */

    }
}
