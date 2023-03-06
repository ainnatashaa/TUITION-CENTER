
public class Name{
    //private can only be access by this class
    public String fname;
    public String mname;
    public String lname;

    //constructor
    //no return, name same as class
    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;

    }

    //public can be access by other class
    public void setFname(String fname){
        //"this" refers to the class attributes
        this.fname = fname; //this.fname means the current object.

    }

    public void setMname(String mname){
        //"this" refers to the class attributes
        this.mname = mname; //this.mname means the current object.

    }

    public void setLname(String lname){
        //"this" refers to the class attributes
        this.lname = lname; //this.lname means the current object.

    }

    //GET method
    public String getFname(){
        return fname;
    }
    public String getMname(){
        return mname;
    }
    public String getLname(){
        return lname;
    }

}