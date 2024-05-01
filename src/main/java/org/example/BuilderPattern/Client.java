package org.example.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee
                .EmployeeBuilder("Akash", "JPMC")
                .setInterest("Travel")
                .build();
        System.out.println(employee);
    }
}