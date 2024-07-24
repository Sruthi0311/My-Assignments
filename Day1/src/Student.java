import java.util.*;
public class Student {
    int studentId;
    String studentName;
    String city;
    int marks1;
    int marks2;
    int marks3;
    float feePerMonth;
    Boolean isEligibleForScholarship;
    float getAnnualFee(){
        return feePerMonth*12;
    }
    int getTotalmarks(){
        return (marks1+marks2+marks3);
    }
    double getAverage(){
        return ((marks1+marks2+marks3)/3);
    }
    String getResult(){
       String output="";
       if(marks1>60 && marks2>60 && marks3>60){
           output="pass";
       }
       else{
            output="fail";
        }
        return output;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;

    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setCity(String city){
        this.city=city;

    }
    public String getCity(){
        return city;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public float getFeePerMonth() {
        return feePerMonth;
    }

    public void setFeePerMonth(float feePerMonth) {
        this.feePerMonth = feePerMonth;
    }

    public Boolean getEligibleForScholarship() {
        return isEligibleForScholarship;
    }

    public void setEligibleForScholarship(Boolean eligibleForScholarship) {
        isEligibleForScholarship = eligibleForScholarship;
    }
}


