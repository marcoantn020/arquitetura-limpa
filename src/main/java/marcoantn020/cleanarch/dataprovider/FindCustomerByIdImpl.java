package marcoantn020.cleanarch.dataprovider;

import marcoantn020.cleanarch.core.dataprovider.FindCustomerById;
import marcoantn020.cleanarch.core.domain.Customer;
import marcoantn020.cleanarch.dataprovider.repository.CustomerRepository;
import marcoantn020.cleanarch.dataprovider.repository.mapper.CustomerEntityMapperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapperRepository customerEntityMapper;

    @Override
    public Optional<Customer> find(String customerID) {
        var customerEntity = customerRepository.findById(customerID);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
