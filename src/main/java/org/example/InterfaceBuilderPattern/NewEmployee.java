package org.example.InterfaceBuilderPattern;

public class NewEmployee implements Employee{
    String name, orgName, interest;
    Boolean petOwner;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getOrgName() {
        return this.orgName;
    }

    @Override
    public Boolean isPetOwner() {
        return this.petOwner;
    }

    @Override
    public String getInterest() {
        return this.interest;
    }
    public NewEmployee(String name, String orgName){
        this.name= name;
        this.orgName= orgName;
    }
    public NewEmployee(Builder builder){
        this.name= builder.name;
        this.orgName= builder.orgName;
        this.petOwner= builder.petOwner;
        this.interest= builder.interest;
    }
    public static class Builder extends NewEmployee{
        Builder(String name, String orgName){
            super(name, orgName);
        }
        public Builder setInterest(String interest){
            this.interest= interest;
            return this;
        }
        public Builder isPetOwer(Boolean petOwner){
            this.petOwner= petOwner;
            return this;
        }
        public Employee build(){
            return new NewEmployee(this);
        }
    }
}
