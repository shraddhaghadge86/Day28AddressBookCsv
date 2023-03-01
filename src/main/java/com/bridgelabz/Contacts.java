package com.bridgelabz;

public class Contacts {
    private int count;
    private String f_name; //first name
    private String l_name; //last name
    private String address;
    private String city;
    private String state;
    private String zip;
    private String ph_no; //phone number
    private String email;

    public Contacts() {
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Contacts(int count, String f_name,String l_name,String address,String city,String state,String zip,String ph_no,String email) {
        this.count = count;
        this.f_name = f_name;
        this.l_name = l_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.ph_no = ph_no;
        this.email = email;
    }
    public String toString() {
        return "\nS.no: "+count+"\nFirst name: "+f_name+"\nLast name: "+l_name
                +"\nAddress: "+address+"\nCity: "+city
                +"\nState: "+state+"\nZip: "+zip
                +"\nPhone number: "+ph_no+"\nEmail address: "+email;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
