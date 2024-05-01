package org.example.BuilderPattern;

class Employee {
    private String name;
    private String orgName;
    private boolean petOwner; //optional
    private String interest;  //optional

    Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.petOwner = employeeBuilder.petOwner;
        this.interest = employeeBuilder.interest;
        this.orgName = employeeBuilder.orgName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", orgName='" + orgName + '\'' +
                ", petOwner=" + petOwner +
                ", interest='" + interest + '\'' +
                '}';
    }

    public static class EmployeeBuilder {
        private String name, orgName, interest;
        private boolean petOwner;

        EmployeeBuilder(String name, String orgName) {
            this.name = name;
            this.orgName = orgName;
        }

        public EmployeeBuilder setPetOwner(Boolean petOwner) {
            this.petOwner = petOwner;
            return this;
        }

        public EmployeeBuilder setInterest(String interest) {
            this.interest = interest;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}