package marcoantn020.cleanarch.core.usecase;

import marcoantn020.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipcode);
}
