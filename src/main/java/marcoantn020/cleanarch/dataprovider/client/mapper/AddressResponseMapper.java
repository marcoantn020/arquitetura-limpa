package marcoantn020.cleanarch.dataprovider.client.mapper;

import marcoantn020.cleanarch.core.domain.Address;
import marcoantn020.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse response);

}
