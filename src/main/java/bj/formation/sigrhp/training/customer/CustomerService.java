package bj.formation.sigrhp.training.customer;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public CustomerResponse create(@Valid CustomerRequest request) {
        Customer customer = new Customer(
                request.name(),
                request.phone(),
                request.email()
        );
        repository.save(customer);
        return new CustomerResponse(
                customer.getId(), customer.getName(), customer.getEmail(), customer.getPhone()
        );
    }
}
