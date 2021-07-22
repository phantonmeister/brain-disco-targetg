package designpatterns.structural.composite.family;

public class FamilyComposite {

    public static void main(String... args){

        HumanComponent firstChild = new ChildLeaf("ChildFName", "ChildLName");
        HumanComponent secondChild = new ChildLeaf("ChildF2Name", "ChildL2Name");

        HumanComponent father = new FatherLeaf("FatherFName", "FatherLName");

        HumanComponent grandFather = new GrandFatherLeaf("GrandFName", "GrandLName");

        father.addChild(firstChild);
        father.addChild(secondChild);
        father.addParent(grandFather);

        firstChild.addParent(father);
        secondChild.addParent(father);

        grandFather.addChild(father);

        grandFather.printDetails();
        father.printDetails();
        firstChild.printDetails();

    }

}
