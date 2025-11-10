package pizza;

import visitor.Visitor;

public interface Pizza{
    void accept(Visitor visitor);
}