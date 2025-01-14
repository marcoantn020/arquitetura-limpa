package marcoantn020.cleanarch.entrypoint.consumer.mapper;

import marcoantn020.cleanarch.core.domain.Customer;
import marcoantn020.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
