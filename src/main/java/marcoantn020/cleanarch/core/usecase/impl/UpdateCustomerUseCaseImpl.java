package marcoantn020.cleanarch.core.usecase.impl;

import marcoantn020.cleanarch.core.dataprovider.FindAddressByZipCode;
import marcoantn020.cleanarch.core.dataprovider.UpdateCustomer;
import marcoantn020.cleanarch.core.domain.Customer;
import marcoantn020.cleanarch.core.usecase.FindCustomerByIdUseCase;
import marcoantn020.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCode findAddressByZipCode,
            UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipcode) {
        findCustomerByIdUseCase.find(customer.getCustomerId());
        var address = findAddressByZipCode.find(zipcode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
