package marcoantn020.cleanarch.core.usecase.impl;

import marcoantn020.cleanarch.core.dataprovider.FindCustomerById;
import marcoantn020.cleanarch.core.domain.Customer;
import marcoantn020.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String customerId) {
        return findCustomerById.find(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
