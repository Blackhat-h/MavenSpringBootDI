package in.dsoft.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Getservices {
    private Dao da ;

    public Getservices(Dao da) {
        this.da=da;
    }

    public void getname (int id){
        String name = da.getid(id);
        System.out.printf("Name = "+name);
    }
}
