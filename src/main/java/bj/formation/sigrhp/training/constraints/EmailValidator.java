package bj.formation.sigrhp.training.constraints;

import bj.formation.sigrhp.training.customer.Customer;
import bj.formation.sigrhp.training.customer.CustomerRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Optional;

public class EmailValidator implements ConstraintValidator<UniqueEmail, String> {

    private final CustomerRepository customerRepository;

    public EmailValidator(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void initialize(UniqueEmail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        Optional<Customer> optionalCustomer = customerRepository.findCustomerByEmail(email);
        return optionalCustomer.isEmpty();
    }
}
