package marcoantn020.cleanarch.dataprovider;

import marcoantn020.cleanarch.core.dataprovider.DeleteCustomerById;
import marcoantn020.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String customerId) {
        customerRepository.deleteById(customerId);
    }
}
