package io.fdlessard.codebites.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements Serializable {

    private Long id;

    @NotBlank(message = "lastName name cannot be blank")
    @Size(min = 2, message = "lastName must have more thant 2 characters")
    private String lastName;

    @NotBlank(message = "firstName name cannot be blank")
    @Size(min = 2, message = "firstName must have more thant 2 characters")
    private String firstName;

    @NotBlank(message = "company name cannot be blank")
    @Size(min = 2, message = "company must have more thant 2 characters")
    private String company;

    private List<Address> addresses;
}
