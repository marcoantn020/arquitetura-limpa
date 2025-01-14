package marcoantn020.cleanarch.entrypoint.consumer.message;

public record CustomerMessage(
        String customerId,
        String name,
        String zipcode,
        String cpf,
        Boolean validCpf
) {
}
