package marcoantn020.cleanarch.dataprovider;

import marcoantn020.cleanarch.core.dataprovider.InsertCustomer;
import marcoantn020.cleanarch.core.domain.Customer;
import marcoantn020.cleanarch.dataprovider.repository.CustomerRepository;
import marcoantn020.cleanarch.dataprovider.repository.mapper.CustomerEntityMapperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapperRepository customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
