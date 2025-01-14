package marcoantn020.cleanarch.dataprovider.client;

import marcoantn020.cleanarch.core.dataprovider.FindAddressByZipCode;
import marcoantn020.cleanarch.core.domain.Address;
import marcoantn020.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZiCodeClient findAddressByZiCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var address = findAddressByZiCodeClient.find(zipcode);
        return addressResponseMapper.toAddress(address);
    }
}
