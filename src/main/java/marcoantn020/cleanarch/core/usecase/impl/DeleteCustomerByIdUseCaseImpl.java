package marcoantn020.cleanarch.core.usecase.impl;

import marcoantn020.cleanarch.core.dataprovider.DeleteCustomerById;
import marcoantn020.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import marcoantn020.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerById deleteCustomerById) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String customerId) {
        findCustomerByIdUseCase.find(customerId);
        deleteCustomerById.delete(customerId);
    }
}
