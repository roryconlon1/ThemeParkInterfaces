package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public Boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() < 16){
            return true;
        }return false;
    }
}
