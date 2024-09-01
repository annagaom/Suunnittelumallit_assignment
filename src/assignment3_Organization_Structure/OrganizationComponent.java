package assignment3_Organization_Structure;

abstract class OrganizationComponent {
    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException();
    }

    public abstract double getSalary();
    public abstract void printXml(StringBuilder builder, String indent);
}