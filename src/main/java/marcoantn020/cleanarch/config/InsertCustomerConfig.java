package marcoantn020.cleanarch.config;

import marcoantn020.cleanarch.core.dataprovider.SendCpfForValidation;
import marcoantn020.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import marcoantn020.cleanarch.dataprovider.InsertCustomerImpl;
import marcoantn020.cleanarch.dataprovider.SendCpfForValidationImpl;
import marcoantn020.cleanarch.dataprovider.client.FindAddressByZipCodeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer,sendCpfForValidation);
    }
}
