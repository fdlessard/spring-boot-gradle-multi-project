package io.fdlessard.codebites.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    private Long id;
    private String date;
    private List<OrderItem> orderItems;

}

