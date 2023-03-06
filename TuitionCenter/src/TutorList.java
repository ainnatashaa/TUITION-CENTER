

public class TutorList{

    public Tutor tutors[] = new Tutor[10];
    public int currsz = 0;

    //constructor
    public TutorList(){

    }

    // operation
    public void add(Tutor s, int i) {
        tutors[i] = s;
        currsz++;

    }

}