public class StudentBatch {
    // data section
    // what is a StudentBatch
    // a StudentBatch is a list of students registered in a batch
    // "list of students"???? an array of Student
    public Student students[] = new Student[100];
    public int currsz = 0;
    public Student student;

    //constructor
    public StudentBatch(){

    }

    // operation
    public void add(Student s, int i) {
        students[i] = s;
        currsz++;
    }


    // method overloading
    // public void add(Student s) {
    //     students[currsz++] = s;
    // }    

    // find a particular student
    public boolean find(String mname) {
        // loop thru the array students
        // for each student in students
        //    check whether name is the same as that in student
        for (int i=0; i<currsz; i++) {
            if (students[i].name.getMname() == mname)
                return true;
        }
        return false;
    }


    //GET method 
    public boolean getBoolean(){
        return false;
    }

}