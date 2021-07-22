package designpatterns.structural.composite.family;

/*
This is a component class.
 */
public interface HumanComponent {

    public void printDetails();
    public void addChild(HumanComponent child);
    public void addParent(HumanComponent parent);

    public String getFirstName();
    public String getLastName();
}
