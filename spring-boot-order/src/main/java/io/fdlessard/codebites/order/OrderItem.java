package io.fdlessard.codebites.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem implements Serializable {


    @NotBlank(message = "product name name cannot be blank")
    @Size(min = 2, message = "product name must have more thant 2 characters")
    private String productName;

    private Integer quantity;

}
