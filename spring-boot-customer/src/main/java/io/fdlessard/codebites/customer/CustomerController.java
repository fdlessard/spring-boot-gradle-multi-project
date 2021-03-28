package io.fdlessard.codebites.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable long id) {

        List<Address> addresses = Arrays.asList(
                Address.builder()
                        .id(id)
                        .number("1")
                        .street("street")
                        .city("city")
                        .postalCode("xxx xxx")
                        .province("province")
                        .country("country")
                        .build(),
                Address.builder()
                        .id(id)
                        .number("1")
                        .street("street")
                        .city("city")
                        .postalCode("xxx xxx")
                        .province("province")
                        .country("country")
                        .build()
        );

        return Customer.builder()
                .id(id)
                .firstName("first name")
                .lastName("last name")
                .company("company name")
                .addresses(addresses)
                .build();
    }
}
