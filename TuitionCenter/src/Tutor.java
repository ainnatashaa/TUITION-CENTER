

public class Tutor {
    // data
    // private String name;
    public Name name; //class for splitting the name
    private String ic;
    public Address address;
    private int numyearexp;
    private String qualification;
    private int yearsincenter;
    //date joined
    public Date date;
    public Student student;

    //constructor

    public Tutor(String ic, int numyearexp, String qualification, int yearsincenter) {
        this.ic = ic;
        this.numyearexp = numyearexp;
        this.qualification = qualification;
        this.yearsincenter = yearsincenter;
    }

    // operation
    //each student assigned to one Tutor
    //5 tutor handle a batch of student(50 students/batch)(1 tutor, 10 students)
    public void setStudent(Student student){
        this.student = student;
    }
    //setter
    public void setName(Name thename) {

        this.name = thename;
    }

    public void setAddress(Address theaddress) {

        this.address = theaddress;
    }

    public void setDate(Date thedate) {
        this.date = thedate;
    }
    public String getIC() {
        return ic;
    }
    public int getnumyearexp() {
        return numyearexp;
    }
    public String getqualification() {
        return qualification;
    }

    public int getyearsincenter(){
        return yearsincenter;
    }

}