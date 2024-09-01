package assignment3_Organization_Structure;

import java.util.ArrayList;
import java.util.List;

class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public double getSalary() {
        double totalSalary = 0;
        for (OrganizationComponent component : components) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }

    @Override
    public void printXml(StringBuilder builder, String indent) {
        builder.append(indent).append("<Department name=\"").append(name).append("\">\n");
        for (OrganizationComponent component : components) {
            component.printXml(builder, indent + "  ");
        }
        builder.append(indent).append("</Department>\n");
    }
}