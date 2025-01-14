package marcoantn020.cleanarch.entrypoint.controller.response;

public record CustomerResponse(
        String name,
        String cpf,
        Boolean validCpf,
        AddressResponse address
) {
}
