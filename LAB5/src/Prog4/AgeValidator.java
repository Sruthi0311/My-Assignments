package Prog4;
public class AgeValidator {
    public String getAgeCode(int age)throws InvalidAgeException {
            if(age>18){
                return "Adult";
            }
            else if(age>0 && age<18){
                return "Child";
            }
            else{
                throw new InvalidAgeException("The Age is Invalid");
        }

    }

}
