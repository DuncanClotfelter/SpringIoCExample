import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Phone")
public class Phone
{

    private String mob;

    public String getMob() {
        return this.mob;
    }

    @Autowired
    public void setMob(String mob) {
        this.mob = mob;
    }
}