package designpatterns.structural.composite.family;

import java.util.ArrayList;
import java.util.List;

public class ChildLeaf implements HumanComponent {

    private String firstName;
    private String lastName;
    private final List<HumanComponent> parents = new ArrayList<>();

    public ChildLeaf(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void printDetails() {
        System.out.println("==============================");
        System.out.println("Child : First Name: "+firstName+", Last Name: "+lastName);
        for(HumanComponent parent : parents)
            System.out.println("Parent : First Name: "+parent.getFirstName()+", Last Name: "+parent.getLastName());
        System.out.println("==============================");
    }

    @Override
    public void addChild(HumanComponent child) {
        /*
        This violates one of the SOLID principles that sub classes shouldn't be forced to implements that they don't
        care about. Oh well. Maybe This pattern chould keep it clear that Component should be an abstract class.
         */
    }

    @Override
    public void addParent(HumanComponent parent) {
        this.parents.add(parent);
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
}
