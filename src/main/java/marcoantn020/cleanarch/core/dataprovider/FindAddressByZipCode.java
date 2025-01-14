package marcoantn020.cleanarch.core.dataprovider;

import marcoantn020.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipcode);
}
