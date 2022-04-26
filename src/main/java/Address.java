import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Address")
public class Address
{

    private String city;
    private String state;
    private String country;
    private String zipcode;

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    @Autowired
    public void setCity(String city) {
        this.city = city;
    }

    @Autowired
    public void setState(String state) {
        this.state = state;
    }

    @Autowired
    public void setCountry(String country) {
        this.country = country;
    }

    @Autowired
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}