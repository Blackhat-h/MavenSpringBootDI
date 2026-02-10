package in.dsoft.beans;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {
    public Dao() {
        System.out.printf("Dao constructor");

    }

    public String getid (int id){
        if(id>100){
            return "Raju";
        }
        else{
            return "Kaju";
        }
    }
}
