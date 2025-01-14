package marcoantn020.cleanarch.core.dataprovider;

import marcoantn020.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final String customerID);
}
