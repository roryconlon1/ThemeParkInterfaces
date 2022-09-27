package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Double charge(Visitor visitor) {
        if(visitor.getAge() < 12){
            return 2.75;
        }return 4.5;
    }
}
