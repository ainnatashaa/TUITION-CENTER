
public class Address{
    //splitting address
    public String street;
    public String city;
    public String state;
    public String zipcode;

    //constructor
    //no return, name same as class
    public Address(String street, String city, String state, String zipcode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;

    }

    //public can be access by other class
    public void setstreet(String street){
        //"this" refers to the class attributes
        this.street = street; //this.fname means the current object. 

    }

    public void setcity(String city){
        //"this" refers to the class attributes
        this.city = city; //this.mname means the current object. 

    }

    public void setstate(String state){
        //"this" refers to the class attributes
        this.state = state; //this.lname means the current object. 

    }

    public void setzipcode(String zipcode){
        //"this" refers to the class attributes
        this.zipcode = zipcode; //this.lname means the current object. 

    }

    //GET method 
    public String getstreet(){
        return street;
    }
    public String getcity(){
        return city;
    }
    public String getstate(){
        return state;
    }
    public String getzipcode(){
        return zipcode;
    }



}