package marcoantn020.cleanarch.config;

import marcoantn020.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import marcoantn020.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import marcoantn020.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(
                findCustomerByIdUseCase,
                deleteCustomerById
        );
    }
}
