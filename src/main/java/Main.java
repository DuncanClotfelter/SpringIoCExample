import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s = (Student) context.getBean("Student");
        //This Student object contains references to the Address and Phone beans as well
        System.out.println(s.getId());
        System.out.println(s.getName());

        Phone p = s.getPh().get(0);
        System.out.println(p.getMob());

        Address a = s.getAdd();
        System.out.println(a.getCity());
        System.out.println(a.getState());
        System.out.println(a.getCountry());
        System.out.println(a.getZipcode());
    }
}
