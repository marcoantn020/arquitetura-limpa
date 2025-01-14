package marcoantn020.cleanarch.dataprovider.repository.entity;

import marcoantn020.cleanarch.core.domain.Address;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tb_customers")
public class CustomerEntity {
    @Id
    private String customerId;
    private String name;
    private String cpf;
    private Address address;
    private Boolean isValidCpf;

    public CustomerEntity(String customerId, String name, String cpf, Address address, Boolean isValidCpf) {
        this.customerId = customerId;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.isValidCpf = isValidCpf;
    }

    public CustomerEntity() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
