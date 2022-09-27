package behaviours;

import people.Visitor;

public interface ITicketed {
    public Double charge(Visitor visitor);
}
