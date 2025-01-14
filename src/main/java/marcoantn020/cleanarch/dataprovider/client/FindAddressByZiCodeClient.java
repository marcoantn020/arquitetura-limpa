package marcoantn020.cleanarch.dataprovider.client;

import marcoantn020.cleanarch.dataprovider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZiCodeClient",
        url = "${client.address.url}"

)
public interface FindAddressByZiCodeClient {
    @GetMapping("/{zipcode}")
    AddressResponse find(@PathVariable("zipcode") String zipcode);
}
