
public class Date {
    private String day;
    private String month;
    private String year;

    public Date(String day, String month, String year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(String day){
        //"this" refers to the class attributes
        this.day = day; //this.fname means the current object.

    }

    public void setMonth(String month){
        //"this" refers to the class attributes
        this.month = month; //this.mname means the current object.

    }

    public void setYear(String year){
        //"this" refers to the class attributes
        this.year = year; //this.lname means the current object.

    }

    //GET method
    public String getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }
    public String getYear(){
        return year;
    }

}
