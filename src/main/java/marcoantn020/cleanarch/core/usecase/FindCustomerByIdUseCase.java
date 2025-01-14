package marcoantn020.cleanarch.core.usecase;

import marcoantn020.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String customerId);
}
