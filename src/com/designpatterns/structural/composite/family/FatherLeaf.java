package designpatterns.structural.composite.family;

import java.util.ArrayList;
import java.util.List;

/*
Leaf class in Composite pattern. Inherits from HumanComponent.
 */
public class FatherLeaf implements HumanComponent {

    private final String firstName;
    private final String lastName;
    private final List<HumanComponent> children = new ArrayList<>();
    private final List<HumanComponent> parents = new ArrayList<>();

    public FatherLeaf(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void printDetails() {

        System.out.println("==============================");
        System.out.println("Father : First Name: "+firstName+", Last Name: "+lastName);
        for(HumanComponent child : children)
            System.out.println("Children : First Name: "+child.getFirstName()+", Last Name: "+child.getLastName());
        for(HumanComponent parent : parents)
            System.out.println("Parents : First Name: "+parent.getFirstName()+", Last Name: "+parent.getLastName());
        System.out.println("==============================");
    }

    @Override
    public void addChild(HumanComponent child) {
        this.children.add(child);
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
