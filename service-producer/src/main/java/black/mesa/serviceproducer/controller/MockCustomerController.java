package black.mesa.serviceproducer.controller;

import black.mesa.serviceproducer.dao.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RequestMapping("/api/v1/customers")
@RestController
public class MockCustomerController {
    @PostMapping("")
    public String addCustomer(@RequestBody Customer customer) {
        Date startDate = customer.getStartDate();

        return "success";
    }

    @GetMapping("/{customer-id}")
    public Customer getCustomer(@RequestParam("customer-id") Long customerId) {
        return new Customer(customerId,"", "", null);
    }
}
