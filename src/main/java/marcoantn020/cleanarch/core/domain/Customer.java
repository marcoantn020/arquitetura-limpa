package marcoantn020.cleanarch.core.domain;

public class Customer {
    private String customerId;
    private String name;
    private String cpf;
    private Address address;
    private Boolean isValidCpf;

    public Customer(String customerId, String name, String cpf, Address address) {
        this.customerId = customerId;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    public Customer() {
        this.isValidCpf = false;
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
