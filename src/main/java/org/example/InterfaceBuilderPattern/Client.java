package org.example.InterfaceBuilderPattern;

public class Client {
    public static void main(String[] args) {
        Employee employee = new NewEmployee.Builder("Akash", "Mphasis")
                .setInterest("Sometime coding")
                .isPetOwer(true);
        System.out.println(employee.getName()+" "+employee.getOrgName()+" "+employee.getInterest()+" "+employee.isPetOwner());
    }
}