//address
//name
//headmaster
//list of teacher//tutor(tutorList)
//list of student(studentBatch)
public class TuitionCenter{

    //data
    private String centername;
    private Address centeraddress;
    private String headmaster;
    public Student student;
    public Tutor tutor;


    //a numbr of tutors handle batches of studentBatch
    //each studnt assigned to one tutor
    //Tutorlist tutorlist; 
    //ListofStudentCenter centerlist;

    //constructor
    public TuitionCenter(String centername, String headmaster){
        this.centername = centername;
        this.headmaster = headmaster;
    }




    //setter 
    public void setCenterName(String centername){
        this.centername = centername;
    }
    public void setCenterAddress(Address centeraddress){
        this.centeraddress = centeraddress;
    }
    public void setHeadmaster(String headmaster){
        this.headmaster = headmaster;
    }


    //getter
    public String getCenterName(){
        return centername;
    }
    public Address getCenterAddress(){
        return centeraddress;
    }
    public String getHeadmaster(){
        return headmaster;
    }




}