package marcoantn020.cleanarch.core.usecase;

import marcoantn020.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipcode);
}
