package marcoantn020.cleanarch.dataprovider.repository.entity;

public class AddressEntity {
    private String street;
    private String city;
    private String state;

    public AddressEntity(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public AddressEntity() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
