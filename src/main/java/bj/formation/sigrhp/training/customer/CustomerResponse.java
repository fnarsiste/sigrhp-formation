package bj.formation.sigrhp.training.customer;

public record CustomerResponse(
        long customerId,
        String customerName,
        String customerEmail,
        String customerPhone
) {
}
