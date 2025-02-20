package bj.formation.sigrhp.training.customer;

public record CustomerResponse(
        long id,
        String customerName,
        String customerEmail,
        String customerPhone
) {
}
