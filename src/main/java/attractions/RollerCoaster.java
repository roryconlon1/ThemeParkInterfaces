package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public Boolean isAllowedTo(Visitor visitor){
        if(visitor.getHeight() > 145.00 && visitor.getAge() > 12){
            return true;
        }return false;
    }

    public Double charge(Visitor visitor){
        if(visitor.getHeight() > 200.00){
            return 9.00;
        }return 4.50;
    }
}
