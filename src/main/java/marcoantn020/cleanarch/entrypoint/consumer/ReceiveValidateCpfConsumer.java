package marcoantn020.cleanarch.entrypoint.consumer;

import marcoantn020.cleanarch.core.usecase.UpdateCustomerUseCase;
import marcoantn020.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import marcoantn020.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidateCpfConsumer {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validate", groupId = "marcoantn020")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.zipcode());
    }
}
