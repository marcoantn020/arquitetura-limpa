package marcoantn020.cleanarch.entrypoint.controller;

import jakarta.validation.Valid;
import marcoantn020.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import marcoantn020.cleanarch.core.usecase.FindCustomerByIdUseCase;
import marcoantn020.cleanarch.core.usecase.InsertCustomerUseCase;
import marcoantn020.cleanarch.core.usecase.UpdateCustomerUseCase;
import marcoantn020.cleanarch.dataprovider.repository.mapper.CustomerEntityMapperRepository;
import marcoantn020.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import marcoantn020.cleanarch.entrypoint.controller.request.CustomerRequest;
import marcoantn020.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CustomerEntityMapperRepository customerEntityMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid CustomerRequest request) {
        var customer = customerMapper.toCustomer(request);
        insertCustomerUseCase.insert(customer, request.zipcode());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> find(@PathVariable("id") String customerId) {
        var customer = findCustomerByIdUseCase.find(customerId);
        return ResponseEntity.ok(customerEntityMapper.toCustomerResponse(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerResponse> update(
            @PathVariable("id") String customerId,
            @RequestBody CustomerRequest request) {
        var customer = customerMapper.toCustomer(request);
        customer.setCustomerId(customerId);
        updateCustomerUseCase.update(customer, request.zipcode());
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String customerId) {
        deleteCustomerByIdUseCase.delete(customerId);
        return ResponseEntity.noContent().build();
    }
}
