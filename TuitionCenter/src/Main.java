
// application team in UTP

public class Main
{
    // application code
    public static void main(String[] args) {
        //set
        Name name = new Name("","","");
        Date date = new Date("", "","");
        Address address = new Address("","","","");

        //TUTOR 1                   IC               #YEAREXP                     QUALIFICAION      #YEARS
        Tutor chou = new Tutor("950321410215", 3, "MASTER IN MATHEMATICS", 1);
        name = new Name("Chou", "Tzu", "yu");
        date = new Date("22","3","2023");
        address = new Address("NO.21", "HL", "Selangor", "43100");
        chou.setAddress(address);
        chou.setName(name);
        chou.setDate(date);
        //TUTOR 2
        Tutor park = new Tutor("970312420245", 10, "PHD", 5);
        name = new Name("Park", "Ji", "Hyo");
        date = new Date("5","7","2023");
        address = new Address("Lot 321", "Kajang", "Selangor", "36100");
        park.setAddress(address);
        park.setName(name);
        park.setDate(date);
        //TUTOR 3
        Tutor lee = new Tutor("960325143257", 5, "MASTER IN COMPUTER SCIENCE", 3);
        name = new Name("Lee", "Do", "Hyun");
        date = new Date("9","11","2022");
        address = new Address("Jln Pahang", "Kuantan", "Pahang", "36100");
        lee.setAddress(address);
        lee.setName(name);
        lee.setDate(date);

        TutorList tutorlist = new TutorList();
        tutorlist.add(lee, 0); //adding the tutors n the tutorlist class
        tutorlist.add(park, 1);
        tutorlist.add(chou, 2);

        //STUDENT 1                      IC               SCHOOLNAME     TUTOR
        Student ayen = new Student("030311452103", "SMK ABDUL JALIL" , chou);//using constructor
        //assign the student in tutor
        chou.setStudent(ayen);
        name = new Name("Nurain","Natasha","Sasaili");
        address = new Address("V3A-01", "UTP", "Perak", "36100");
        ayen.setName(name);
        ayen.setAddress(address);
        ayen.setMarks(60, 0); // set the marks for ayen
        ayen.setMarks(50, 1);
        ayen.setMarks(34, 2);
        ayen.setMarks(75, 3);
        ayen.setMarks(61, 4);
        //STUDENT 2
        Student aisyah = new Student("034522113564", "SMK CHUKAI     ", park);
        park.setStudent(aisyah);
        name = new Name("Nur", "Aisyahh", "Mustapha");//Create an object
        address = new Address("V3A-02", "UTP", "Perak", "36100");
        aisyah.setName(name);
        aisyah.setAddress(address);
        aisyah.setMarks(40, 0); // set the marks for aisyah
        aisyah.setMarks(85, 1);
        aisyah.setMarks(24, 2);
        aisyah.setMarks(55, 3);
        aisyah.setMarks(33, 4);
        //STUDENT 3
        Student hasya = new Student("020422635789", "SMK KDAMANSARA", lee); //student() -> java will automaticly put a blank constructor
        lee.setStudent(hasya);
        name = new Name("Hasya", "Irdina", "HelmiRizal");
        address = new Address("V3A-02", "UTP", "Perak", "36100");
        hasya.setName(name);
        hasya.setAddress(address);
        hasya.setMarks(10, 0); // set the marks for aisyah
        hasya.setMarks(50, 1);
        hasya.setMarks(20, 2);
        hasya.setMarks(88, 3);
        hasya.setMarks(67, 4);
        //STUDENT 4
        Student miera = new Student("032455745684","SMS FARIZ PETRA", chou); //student() -> java will automaticly put a blank constructor
        chou.setStudent(miera);
        name = new Name("Nur", "Amiera", "Mohd Nazriey");
        address = new Address("V3A-01", "UTP", "Perak", "36100");
        miera.setName(name);
        miera.setAddress(address);
        miera.setMarks(70, 0); // set the marks for miera
        miera.setMarks(86, 1);
        miera.setMarks(75, 2);
        miera.setMarks(75, 3);
        miera.setMarks(65, 4);

        Student aleyah = new Student("061230102497","SMK ABDUL JALIL", park); //student() -> java will automaticly put a blank constructor
        park.setStudent(aleyah);
        name = new Name("NurAleyah", "Aisya", "Rosidin");
        address = new Address("NO.12", "IKBN", "Selangor", "43100");
        aleyah.setName(name);
        aleyah.setAddress(address);
        aleyah.setMarks(52, 0); // set the marks for miera
        aleyah.setMarks(35, 1);
        aleyah.setMarks(77, 2);
        aleyah.setMarks(98, 3);
        aleyah.setMarks(67, 4);

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        StudentBatch sb2024 = new StudentBatch();

        //batch 2023 students
        sb2023.add(aleyah, 0);
        sb2023.add(hasya, 1);
        sb2023.add(miera, 2);

        //batch 2024 students
        sb2024.add(ayen, 0);
        sb2024.add(aisyah, 1);

        //creating a tuition center
        TuitionCenter KLhq = new TuitionCenter("KUALA LUMPUR HQ", "SIR CHRISTOPHER");
        address = new Address("JALAN HANG TUAH", "KL", "WILAYAH PERSEKUTUAN", "52100");
        KLhq.setCenterAddress(address);

        TuitionCenter JBhq = new TuitionCenter("JOHOR BAHRU HQ", "MISS ELYNA");
        address = new Address("JALAN BANDAR BARU", "JOHOR BAHRU", "JOHOR", "64100");
        JBhq.setCenterAddress(address);

        ListofTuitionCenter centerlist = new ListofTuitionCenter();
        centerlist.add(KLhq, 0);
        centerlist.add(JBhq, 1);


/////////////// KL CENTER
        System.out.println("************************************************************************");
        System.out.println("\t\t\t\tPANDAI SDN BHD PERFORMANCE REPORT");
        System.out.println("************************************************************************");
        System.out.println("Total number of tutors: " + tutorlist.currsz);
        System.out.println("Total number of 2023 batch students: " + sb2023.currsz);
        System.out.println("Total number of 2024 batch students: " + sb2024.currsz);
        System.out.println("\n--------------------------TUTOR LIST--------------------------");
        System.out.println("NO\tNAME\t\t\tIC NUMBER\t\tDATE JOINED\t\tYEARS IN CENTER\t\tQUALIFICATION");
        for(int i=0; i < tutorlist.currsz ; i++) {
            System.out.print((i+1) + "    " + tutorlist.tutors[i].name.getFname() + " " + tutorlist.tutors[i].name.getMname() + " " + tutorlist.tutors[i].name.getLname());
            System.out.print("\t" + tutorlist.tutors[i].getIC());
            System.out.print("\t " + tutorlist.tutors[i].date.getDay() + "/" + tutorlist.tutors[i].date.getMonth() + "/" + tutorlist.tutors[i].date.getYear());
            System.out.print("\t\t\t " + tutorlist.tutors[i].getyearsincenter());
            System.out.println("\t\t\t\t" + tutorlist.tutors[i].getqualification());

        }

        System.out.println("\n--------------------------STUDENT LIST--------------------------");
        System.out.println("NO\tBATCH\tNAME\t\t\t\t\t\t\tIC NUMBER\t\tSCHOOL NAME\t\t\tADDRESS");
        for(int i=0; i < sb2023.currsz; i++){
            System.out.print((i+1) + "\t2023\t");
            System.out.print(sb2023.students[i].name.getFname() + " " + sb2023.students[i].name.getMname() + " " + sb2023.students[i].name.getLname() + "\t\t" );
            System.out.print("\t" + sb2023.students[i].getic());
            System.out.print("\t" + sb2023.students[i].getschoolname());
            System.out.println("\t\t" + sb2023.students[i].address.getstreet() + ", " + sb2023.students[i].address.getcity() + ", " + sb2023.students[i].address.getstate() + ", " + sb2023.students[i].address.getzipcode());
        }
        int j = sb2023.currsz + 1;
        for(int i=0; i < sb2024.currsz; i++){
            System.out.print((j++) + "\t2024\t");
            System.out.print(sb2024.students[i].name.getFname() + " " + sb2024.students[i].name.getMname() + " " + sb2024.students[i].name.getLname() + "\t\t" );
            System.out.print("\t" + sb2024.students[i].getic());
            System.out.print("\t" + sb2024.students[i].getschoolname());
            System.out.println("\t\t" + sb2024.students[i].address.getstreet() + ", " + sb2024.students[i].address.getcity() + ", " + sb2024.students[i].address.getstate() + ", " + sb2024.students[i].address.getzipcode());
        }



        System.out.println("\n************************************************************************");
        System.out.println("\t\t\t\t\t\t" + (centerlist.center[0].getCenterName()));
        System.out.println("************************************************************************");
        System.out.println("--------------------------BATCH 2023--------------------------");
        System.out.println("NO\t  NAME\t\t\t\tMARKS\t\t\t\tAVG\t\tMIN\t\tMAX\t\tTUTOR");
        for(int i=0; i < 3; i++) {
            System.out.print((i+1) + "    " + sb2023.students[i].name.getMname() + "\t\t" );
            sb2023.students[i].displayMarks();
            System.out.print("\t" + sb2023.students[i].calcAvg());
            System.out.print("\t" + sb2023.students[i].calcMin());
            System.out.print("\t" + sb2023.students[i].calcMax());
            System.out.println("\t" +sb2023.students[i].gettutor().name.getMname() + " " + sb2023.students[i].gettutor().name.getLname());
        }

        System.out.println("\n--------------------------BATCH 2024--------------------------");
        System.out.println("NO\t  NAME\t\t\t\tMARKS\t\t\t\tAVG\t\tMIN\t\tMAX\t\tTUTOR");
        for(int i=0; i < 2; i++) {
            System.out.print((i+1) + "    " + sb2024.students[i].name.getMname() + "\t" );
            sb2024.students[i].displayMarks();
            System.out.print("\t" + sb2024.students[i].calcAvg());
            System.out.print("\t" + sb2024.students[i].calcMin());
            System.out.print("\t" + sb2024.students[i].calcMax());
            System.out.println("\t" +sb2024.students[i].gettutor().name.getMname() + " " + sb2024.students[i].gettutor().name.getLname());
        }



        /////////////    JOHOR BAHRU CENTER
        System.out.println("\n************************************************************************");
        System.out.println("\t\t\t\t\t\t" + (centerlist.center[1].getCenterName()));
        System.out.println("************************************************************************");
        System.out.println("--------------------------BATCH 2023--------------------------");
        System.out.println("NO\t  NAME\t\t\t\t\tMARKS\t\t\t\tAVG\t\tMIN\t\tMAX\t\tTUTOR");
        for(int i=0; i < 2; i++) {
            System.out.print((i+1) + "    " + sb2023.students[i].name.getLname() + "\t\t" );
            sb2023.students[i].displayMarks();
            System.out.print("\t" + sb2023.students[i].calcAvg());
            System.out.print("\t" + sb2023.students[i].calcMin());
            System.out.print("\t" + sb2023.students[i].calcMax());
            System.out.println("\t" +sb2023.students[i].gettutor().name.getMname() + " " + sb2023.students[i].gettutor().name.getLname());
        }

        System.out.println("\n--------------------------BATCH 2024--------------------------");
        System.out.println("NO\t  NAME\t\t\t\tMARKS\t\t\t\tAVG\t\tMIN\t\tMAX\t\tTUTOR");
        for(int i=0; i < 2; i++) {
            System.out.print((i+1) + "    " + sb2024.students[i].name.getFname() + "\t\t" );
            sb2024.students[i].displayMarks();
            System.out.print("\t" + sb2024.students[i].calcAvg());
            System.out.print("\t" + sb2024.students[i].calcMin());
            System.out.print("\t" + sb2024.students[i].calcMax());
            System.out.println("\t" +sb2024.students[i].gettutor().name.getMname() + " " + sb2024.students[i].gettutor().name.getLname());
        }

        // declare a method that allows for the following:
        boolean isIn = sb2023.find("Amiera");
        System.out.print("\n\nSearch for Amiera in batch 2023 = ");
        System.out.println(isIn);

    }
}
