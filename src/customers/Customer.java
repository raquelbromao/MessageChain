package customers;

import places.Address;
import places.Continent;

public class Customer {
    
    private final String name;
    private Address address;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Continent isEurope(){
        return address.isEurope();
    }

}
