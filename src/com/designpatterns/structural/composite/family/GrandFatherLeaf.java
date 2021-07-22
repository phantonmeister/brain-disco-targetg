package designpatterns.structural.composite.family;

import java.util.ArrayList;
import java.util.List;

public class GrandFatherLeaf implements HumanComponent {


    private final String firstName;
    private final String lastName;
    private final List<HumanComponent> children = new ArrayList<>();

    public GrandFatherLeaf(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void printDetails() {

        System.out.println("==============================");
        System.out.println("Grand Father : First Name: "+firstName+", Last Name: "+lastName);
        for(HumanComponent child : children)
            System.out.println("Children : First Name: "+child.getFirstName()+", Last Name: "+child.getLastName());
        System.out.println("==============================");
    }

    @Override
    public void addChild(HumanComponent child) {
        this.children.add(child);
    }

    @Override
    public void addParent(HumanComponent parent) {

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
