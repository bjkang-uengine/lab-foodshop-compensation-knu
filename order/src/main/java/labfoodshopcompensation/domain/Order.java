package labfoodshopcompensation.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import labfoodshopcompensation.OrderApplication;
import labfoodshopcompensation.domain.OrderCancelled;
import labfoodshopcompensation.domain.OrderPlaced;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String menutId;

    private Integer qty;

    private String customerId;

    private Double amount;

    private String status;

    private String address;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {
        // Get request from Order
        //labfoodshopcompensation.external.Order order =
        //    Application.applicationContext.getBean(labfoodshopcompensation.external.OrderService.class)
        //    .getOrder(/** mapping value needed */);

    }

    @PreRemove
    public void onPreRemove() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
