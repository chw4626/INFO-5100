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
public class Checking {
    private String bankname;
    private String bankrout;
    private String bankaccount;
    private String bankbalance;
    private String banktype = "Chencking";

    public String getBanktype() {
        return banktype;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankrout() {
        return bankrout;
    }

    public void setBankrout(String bankrout) {
        this.bankrout = bankrout;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getBankbalance() {
        return bankbalance;
    }

    public void setBankbalance(String bankbalance) {
        this.bankbalance = bankbalance;
    }
    
}
