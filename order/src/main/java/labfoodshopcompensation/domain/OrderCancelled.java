package labfoodshopcompensation.domain;

import java.util.*;
import labfoodshopcompensation.domain.*;
import labfoodshopcompensation.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String menutId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
