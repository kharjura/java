class Employee {
    int id;
    String name;
    String dept;

    public static void main(String[] args) {
        // Create an instance of Employee
        Employee e = new Employee();

        // Assign values to the fields
        e.id = 1;
        e.name = "Karthik";
        e.dept = "Software";

        // Print the values
        System.out.println("Name: " + e.name);
        System.out.println("ID: " + e.id);
        System.out.println("Department: " + e.dept);
    }
}

  