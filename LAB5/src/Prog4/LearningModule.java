package Prog4;

public class LearningModule extends AgeValidator {
    public String getLearningCode(String name, int age) throws WrongInputException {
        String code = name+" ";
        try {
            code += getAgeCode(age);
        } catch (InvalidAgeException invalidAgeException) {
            throw new WrongInputException("Invalid Age");
        }
        return code;
    }
}

