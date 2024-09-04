package assignment3_Organization_Structure;

public class Main {
    public static void main(String[] args) {
        // Create employees
        OrganizationComponent john = new Employee("John", 50000);
        OrganizationComponent jane = new Employee("Jane", 60000);
        OrganizationComponent alice = new Employee("Alice", 45000);

        // Create departments
        OrganizationComponent sales = new Department("Sales");
        OrganizationComponent it = new Department("IT");

        // Add employees to departments
        sales.add(john);
        it.add(jane);
        it.add(alice);


        // Create a root department (the entire organization)
        OrganizationComponent organization = new Department("Organization");
        organization.add(sales);
        organization.add(it);

        // Print total salary
        System.out.println(" " );
        System.out.println("Total Salary: " + organization.getSalary());

        // Print organizational structure in XML format
        StringBuilder xml = new StringBuilder();
        organization.printXml(xml, "");
        System.out.println(xml.toString());
    }
}
