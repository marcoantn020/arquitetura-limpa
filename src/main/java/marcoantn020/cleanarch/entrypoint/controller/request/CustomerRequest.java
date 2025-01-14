package marcoantn020.cleanarch.entrypoint.controller.request;

import jakarta.validation.constraints.NotBlank;

public record CustomerRequest(
       @NotBlank String name,
       @NotBlank String cpf,
       @NotBlank String zipcode
) {
}
