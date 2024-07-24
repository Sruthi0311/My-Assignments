public class TestMain {
    public static void main(String[] args) {
        Student students[]=new Student[3];
        students[0]=new Student();
        students[1]=new Student();
        students[2]=new Student();
        students[0].setStudentId(10);
        students[0].setStudentName("Sruthi");
        students[0].setCity("Coimbatore");
        students[0].setMarks1(70);
        students[0].setMarks2(80);
        students[0].setMarks3(90);
        students[0].setFeePerMonth(1500);

        students[1].setStudentId(11);
        students[1].setStudentName("Pranaav");
        students[1].setCity("Coimbatore");
        students[1].setMarks1(85);
        students[1].setMarks2(95);
        students[1].setMarks3(75);
        students[1].setFeePerMonth(100);

        students[2].setStudentId(12);
        students[2].setStudentName("Sameera");
        students[2].setCity("Coimbatore");
        students[2].setMarks1(98);
        students[2].setMarks2(97);
        students[2].setMarks3(95);
        students[2].setFeePerMonth(200);

        int htm=students[0].getTotalmarks();
        String htms=students[0].getStudentName();
        for(int i=1;i<3;i++){
            if(students[i].getTotalmarks()>htm){
                htm=students[i].getTotalmarks();
                htms=students[i].getStudentName();
            }
        }
        System.out.println(htm);
        System.out.println(htms);
        float lfpm=students[0].getFeePerMonth();
        htms=students[0].getStudentName();
        for(int i=1;i<3;i++){
            if(students[i].getFeePerMonth()<lfpm){
                lfpm=students[i].getFeePerMonth();
                htms=students[i].getStudentName();
            }
        }
        System.out.println(htms);
        System.out.println(lfpm);

        double averagemarks;
        for(int i=0;i<3;i++){
            if(students[i].getAverage()>80d){
                students[i].setEligibleForScholarship(true);
                System.out.println(students[i].getStudentName()+" " +students[i].getTotalmarks()+" " +students[i].getAverage()+" " +students[i].getResult()+" " +"Scholarship Available");
            }
            else{
                students[i].setEligibleForScholarship(false);
                System.out.println(students[i].getStudentName()+" " +students[i].getTotalmarks()+" " +students[i].getAverage()+" " +students[i].getResult()+" " +"Scholarship not Available");

            }
        }

    }
}