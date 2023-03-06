// created by team in KL
public class Student {
    // data/attributes
    public Name name; //class for splitting the name
    public String ic;
    public Address address;
    private String schoolname;
    public float marks[] = new float[5];
    private Tutor tutor;

    //constructor
    //display message everytime a student successfully created
    public Student(String ic, String schoolname, Tutor tutor){
        this.ic = ic;
        this.schoolname = schoolname;
        this.tutor = tutor;
    }

    // methods or operations
    public float calcAvg() {
        float sum=0;
        for(int i=0; i<5; i++){
            sum += marks[i];
        }
        float avg = sum/5;

        return avg;
    }

    public float calcMin() {
        float min = 99999;
        for(int i=0; i<5; i++){
            if(marks[i] < min){
                min = marks[i];
            }
        }

        return min;
    }

    public float calcMax() {
        float max = -99999;
        for(int i=0; i<5; i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }

        return max;
    }



    public void setName(Name thename) {

        name = thename;
    }

    public void setMarks(float mark, int i){
        if(mark < 0)
            System.out.println("Error! Negative mark!");
//            return;
//            throw new Exception("Error in marks!!!");
//        if(i<0 || i> marks.length)
 //           throw new Exception("Error in index!!!");

        marks[i] = mark;
    }

    public void setAddress(Address theaddress) {
        address = theaddress;
    }

    //to test this class
    public void displayMarks(){
        for(int i=0; i< marks.length; i++){
            System.out.print(marks[i] + " ");
        }

    }

    public String getic(){
        return ic;
    }
    public String getschoolname(){
        return schoolname;
    }
    public Tutor gettutor(){
        return tutor;
    }

//    public static void main(String args[]){
//        Student stud0 = new Student();
//        try {//try block... if something int here can cause exception
//            stud0.setMarks(10, 0);
//            stud0.setMarks(20, 1);
//            stud0.setMarks(30, 2);
//            stud0.setMarks(40, 3);
//            stud0.setMarks(50, 4);
//        } catch (Exception ex) { //catch block... acton to be taken in case of Exception
//            System.out.println("Cannot continue");
//            ex.printStackTrace();
//        }
//        stud0.displayMarks();
//        float avg = stud0.calcAvg();
//        float min = stud0.calcMin();
//
//    }
}