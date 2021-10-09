package designpatterns.behavioral.visitor;

public class Patient implements HospitalVisitor{
    @Override
    public String accept(Visitor visitor) {
        String result = visitor.visit(this);
        return "Diagnosis is "+result;
    }
}
