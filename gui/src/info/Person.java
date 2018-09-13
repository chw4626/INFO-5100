/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info;

/**
 *
 * @author haowenchang
 */
public class Person {
    private Demographic Demographic;
    private Address Address;
    private Saving Saving;
    private Checking Checking;
    private Driver Driver;
    private Medical Medical;
    
    public Person(){
        Demographic = new Demographic();
        Address = new Address();
        Saving = new Saving ();
        Checking = new Checking();
        Driver = new Driver();
        Medical = new Medical();
    }
    
    public String getFirstname() {
        return Demographic.getFirstname();
    }

    public void setFirstname(String firstname) {
        this.Demographic.setFirstname(firstname);
    }


    public String getLastname() {
        return Demographic.getLastname();
    }

    public void setLastname(String lastname) {
        this.Demographic.setLastname(lastname);
    }

    public String getPhone() {
        return Demographic.getPhone();
    }

    public void setPhone(String phone) {
        this.Demographic.setPhone(phone);
    }

    public String getDob() {
        return Demographic.getDob();
    }

    public void setDob(String dob) {
        this.Demographic.setDob(dob);
    }

    public String getAge() {
        return Demographic.getAge();
    }

    public void setAge(String age) {
        this.Demographic.setAge(age);
    }

    public String getHeight() {
        return Demographic.getHeight();
    }

    public void setHeight(String height) {
        this.Demographic.setHeight(height);
    }

    public String getWeight() {
        return Demographic.getWeight();
    }

    public void setWeight(String weight) {
        this.Demographic.setWeight(weight);
    }

    public String getSsn() {
        return Demographic.getSsn();
    }

    public void setSsn(String ssn) {
        this.Demographic.setSsn(ssn);
    }

    public String getStreet() {
        return Address.getStreet();
    }

    public void setStreet(String street) {
        this.Address.setStreet(street);
    }

    public String getCity() {
        return Address.getCity();
    }

    public void setCity(String city) {
        this.Address.setCity(city);
    }

    public String getState() {
        return Address.getState();
    }

    public void setState(String state) {
        this.Address.setState(state);
    }

    public String getZip() {
        return Address.getZip();
    }

    public void setZip(String zip) {
        this.Address.setZip(zip);
    }

    public String getBankname() {
        return Checking.getBankname();
    }

    public void setBankname(String bankname) {
        this.Checking.setBankname(bankname);
    }

    public String getBankrout() {
        return Checking.getBankrout();
    }

    public void setBankrout(String bankrout) {
        this.Checking.setBankrout(bankrout);
    }

    public String getBankaccount() {
        return Checking.getBankaccount();
    }

    public void setBankaccount(String bankaccount) {
        this.Checking.setBankaccount(bankaccount);
    }

    public String getBankbalance() {
        return Checking.getBankbalance();
    }

    public void setBankbalance(String bankbalance) {
        this.Checking.setBankbalance(bankbalance);
    }

    public String getBanktype() {
        return Checking.getBanktype();
    }

    /*public void setBanktype(String banktype) {
        this.banktype = banktype;
    }*/

    public String getLicensenum() {
        return Driver.getLicensenum();
    }

    public void setLicensenum(String licensenum) {
        this.Driver.setLicensenum(licensenum);
    }

    public String getIssue() {
        return Driver.getIssue();
    }

    public void setIssue(String issue) {
        this.Driver.setIssue(issue);
    }

    public String getExpiration() {
        return Driver.getExpiration();
    }

    public void setExpiration(String expiration) {
        this.Driver.setExpiration(expiration);
    }

    public String getBloodtype() {
        return Driver.getBloodtype();
    }

    public void setBloodtype(String bloodtype) {
        this.Driver.setBloodtype(bloodtype);
    }

    public String getPic() {
        return Driver.getPic();
    }

    public void setPic(String pic) {
        this.Driver.setPic(pic);
    }

    public String getMedicalnum() {
        return Medical.getMedicalnum();
    }

    public void setMedicalnum(String medicalnum) {
        this.Medical.setMedicalnum(medicalnum);
    }

    public String getAlergy1() {
        return Medical.getAlergy1();
    }

    public void setAlergy1(String alergy1) {
        this.Medical.setAlergy1(alergy1);
    }

    public String getAlergy2() {
        return Medical.getAlergy2();
    }

    public void setAlergy2(String alergy2) {
        this.Medical.setAlergy2(alergy2);
    }

    public String getAlergy3() {
        return Medical.getAlergy3();
    }

    public void setAlergy3(String alergy3) {
        this.Medical.setAlergy3(alergy3);
    }

    public String getSbankname() {
        return Saving.getSbankname();
    }

    public void setSbankname(String sbankname) {
        this.Saving.setSbankname(sbankname);
    }

    public String getSbankrout() {
        return Saving.getSbankrout();
    }

    public void setSbankrout(String sbankrout) {
        this.Saving.setSbankrout(sbankrout);
    }

    public String getSbankaccount() {
        return Saving.getSbankaccount();
    }

    public void setSbankaccount(String sbankaccount) {
        this.Saving.setSbankaccount(sbankaccount);
    }

    public String getSbankbalance() {
        return Saving.getSbankbalance();
    }

    public void setSbankbalance(String sbankbalance) {
        this.Saving.setSbankbalance(sbankbalance);
    }
    
}
