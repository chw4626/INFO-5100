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
public class Saving {
    private String sbankname;
    private String sbankrout;
    private String sbankaccount;
    private String sbankbalance;
    private String banktype = "Saving";

    public String getBanktype() {
        return banktype;
    }

    public String getSbankname() {
        return sbankname;
    }

    public void setSbankname(String sbankname) {
        this.sbankname = sbankname;
    }

    public String getSbankrout() {
        return sbankrout;
    }

    public void setSbankrout(String sbankrout) {
        this.sbankrout = sbankrout;
    }

    public String getSbankaccount() {
        return sbankaccount;
    }

    public void setSbankaccount(String sbankaccount) {
        this.sbankaccount = sbankaccount;
    }

    public String getSbankbalance() {
        return sbankbalance;
    }

    public void setSbankbalance(String sbankbalance) {
        this.sbankbalance = sbankbalance;
    }
    
}
