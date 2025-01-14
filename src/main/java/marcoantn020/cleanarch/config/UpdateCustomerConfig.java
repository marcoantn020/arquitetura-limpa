package marcoantn020.cleanarch.config;

import marcoantn020.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import marcoantn020.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import marcoantn020.cleanarch.dataprovider.UpdateCustomerImpl;
import marcoantn020.cleanarch.dataprovider.client.FindAddressByZipCodeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(
                findCustomerByIdUseCase,
                findAddressByZipCode,
                updateCustomer
        );
    }
}
