package marcoantn020.cleanarch.dataprovider.repository.mapper;

import marcoantn020.cleanarch.core.domain.Customer;
import marcoantn020.cleanarch.dataprovider.repository.entity.CustomerEntity;
import marcoantn020.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapperRepository {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

    CustomerResponse toCustomerResponse(Customer customer);

}
