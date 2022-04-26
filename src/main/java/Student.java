import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("Student")
public class Student
{

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Phone> getPh() {
        return this.ph;
    }

    public Address getAdd() {
        return this.add;
    }

    @Autowired
    @Qualifier("SSN")
    public void setId(int id) {
        this.id = id;
    }

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    @Autowired(required = false)
    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    @Autowired(required = false)
    public void setAdd(Address add) {
        this.add = add;
    }
}