package Visitor;

public interface Visitor {
    void visit(Bank bank);
    void visit(Resident resident);
    void visit(Restaurant restaurant);
}
