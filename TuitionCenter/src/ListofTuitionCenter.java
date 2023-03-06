
public class ListofTuitionCenter{

    public TuitionCenter center[] = new TuitionCenter[5];
    public int currsz = 0;

    public ListofTuitionCenter(){

    }

    public void add(TuitionCenter tcenter, int i){
        center[i] = tcenter;
        currsz++;
    }
}