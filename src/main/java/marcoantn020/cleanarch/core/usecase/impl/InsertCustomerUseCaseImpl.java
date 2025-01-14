package marcoantn020.cleanarch.core.usecase.impl;

import marcoantn020.cleanarch.core.dataprovider.FindAddressByZipCode;
import marcoantn020.cleanarch.core.dataprovider.InsertCustomer;
import marcoantn020.cleanarch.core.dataprovider.SendCpfForValidation;
import marcoantn020.cleanarch.core.domain.Customer;
import marcoantn020.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustomer;
    private final SendCpfForValidation sendCpfForValidation;

    public InsertCustomerUseCaseImpl(
            FindAddressByZipCode findAddressByZipCode,
            InsertCustomer insertCustomer, SendCpfForValidation sendCpfForValidation) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidation = sendCpfForValidation;
    }

    @Override
    public void insert(Customer customer, String zipcode) {
        var address = findAddressByZipCode.find(zipcode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
        sendCpfForValidation.send(customer.getCpf());
    }
}
